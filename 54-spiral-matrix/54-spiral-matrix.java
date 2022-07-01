class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans= new ArrayList<>();
        int minrow=0;
        int mincol=0;
        int maxrow=matrix.length-1;
        int maxcol=matrix[0].length-1;
        int tc=(maxrow+1)*(maxcol+1);
        int cc=0;
        
        while(cc<tc){
            //top
            for(int i=minrow, j=mincol; j<=maxcol && cc<tc; j++){
                ans.add(matrix[i][j]);
                cc++;
            }
            minrow++;
            
            //right
            for(int i=minrow, j=maxcol; i<=maxrow && cc<tc; i++){
                ans.add(matrix[i][j]);
                cc++;
            }
            maxcol--;
            
            //bottom
            for(int i=maxrow, j=maxcol; j>=mincol && cc<tc; j--){
                ans.add(matrix[i][j]);
                cc++;
            }
            maxrow--;
            
            //left
             for(int i=maxrow, j=mincol; i>=minrow && cc<tc; i--){
                ans.add(matrix[i][j]);
                cc++;
            }
            mincol++;
        }
        return ans;
    }
}