class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int prm = 0;
        for(int i = nums.length - 1; i >= 2; i--){
            if(nums[i] < nums[i - 1] + nums[i - 2]){
                prm = nums[i] + nums[i - 1] + nums[i - 2];
                break;
            }
        }
        return prm;
    }
}