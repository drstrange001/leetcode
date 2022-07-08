class Solution {
    class Pair{
        int soldiers;
        int index;
    }
    
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)-> a[0]!=b[0]? b[0]-a[0] :            b[1]-a[1]);
        
        for(int i=0;i<mat.length;i++){
            int count=0;
            for (int j=0; j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
           pq.offer(new int[]{count,i});
        }
        
        while(pq.size()>k){
            pq.poll();
        }
        
        int[] ans = new int[k];
        int j=ans.length-1;
        while(pq.size()>0 && j>=0){
            ans[j]=pq.poll()[1];
            j--;
        }
        
        return ans;
        
    }
}