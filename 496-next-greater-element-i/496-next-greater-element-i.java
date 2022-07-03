class Solution {
    public static int[]  nextGreaterElementInArray(int[] nums2){
        int[] nge =new int[nums2.length];
        Stack<Integer> st= new Stack<>();
        
        st.push(0);
        
        for(int i=0;i<nums2.length;i++){
            while(st.size()>0 && nums2[i]>nums2[st.peek()]){
                int pos= st.peek();
                nge[pos]=nums2[i];
                st.pop(); 
            }
            st.push(i);
        }
        
        while(st.size()!=0){
            int pos= st.peek();
            nge[pos]=-1;
            st.pop(); 
        }
        return nge;
    }
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nxge= nextGreaterElementInArray(nums2);
        
        int[] res=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],nxge[i]);
        }
        
        for(int i=0; i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        
        return res;
        
    }
}