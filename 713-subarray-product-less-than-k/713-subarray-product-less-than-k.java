class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod=1;
        int result=0;
            
        int left=0;
        int right=0;
        
        while(right<nums.length){
            prod*=nums[right];
            
            while(prod>=k && left<=right){
                prod/=nums[left];
                left++;
            }
            
            result+=right-left+1;
            right++;
        }
        
        return result;
    }
}