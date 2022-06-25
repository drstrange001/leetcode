class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums.length<=0) return nums;
        int[] ans= new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int idx=nums.length-1;
        while(i<=j){
            int isq=nums[i]*nums[i];
            int jsq=nums[j]*nums[j];
            
            if(isq>jsq){
                ans[idx]=isq;
                i++;
            } else {
                ans[idx]=jsq;
                j--;
            }
            idx--;
            
    }
        return ans;
}
}