class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[nums.length];
        int[] res = new int[nums.length-k+1];
        st.push(0);
        for(int i = 1; i < nums.length; i++){
            while(st.size() > 0 && nums[i] > nums[st.peek()]){
               int pos = st.peek();
                nge[pos] = i;
                st.pop();
            }
            st.push(i);
        }
        
        while(st.size() > 0){
            int pos = st.peek();
            nge[pos] = nums.length;
            st.pop();
        }
        
        int j = 0;
        for(int i = 0; i <= nums.length - k; i++){
            if(j < i){
                j = i;
            }
            
            while(nge[j] < i + k){
                j = nge[j];
            }
            res[i] = nums[j];
        }
        
        return res;
    }
}