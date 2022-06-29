class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int si=0;
        int ei=0;
        int prevc=0;
        int ans=0;
        while(ei<nums.length){
            if(nums[ei]>=left && nums[ei]<=right){
                prevc=ei-si+1;
                ans+=prevc;
            } else if(nums[ei]<left){
                ans+=prevc;
            } else {
                si=ei+1;
                prevc=0;
            }
            ei++;
        }
        return ans;
    }
}