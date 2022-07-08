class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val: nums){
            pq.add(val);
        }
        
        int m1=pq.remove();
        int m2=pq.remove();
        
        return (m1-1)*(m2-1);
    }
}