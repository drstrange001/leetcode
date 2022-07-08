class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int stone: stones){
            pq.offer(stone);
        }
        
        while(pq.size() > 1){
            int mxwt1 = pq.poll();
            int mxwt2 = pq.poll();
            
            if(mxwt1 > mxwt2) pq.offer(mxwt1 - mxwt2);
            
        }
        
        return pq.size() == 0 ? 0 : pq.poll();
    }
}