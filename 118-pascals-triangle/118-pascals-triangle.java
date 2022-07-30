class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Pascal=new ArrayList();                
        
        List<Integer> first_row=new ArrayList<Integer>();
        first_row.add(1);
        
        Pascal.add(first_row);
                
        for(int i=1;i<numRows;i++){
            List<Integer> list_prevs=Pascal.get(i-1);
            List<Integer> list_row=new ArrayList<Integer>();
            list_row.add(1);         
            for (int j=1;j<i;j++){
                list_row.add(list_prevs.get(j-1)+list_prevs.get(j));
            }                                    
            list_row.add(1);
            Pascal.add(list_row);            
        }
    return Pascal;
    }
}