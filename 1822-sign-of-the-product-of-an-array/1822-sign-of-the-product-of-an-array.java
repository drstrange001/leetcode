class Solution {
    public int arraySign(int[] nums) {
        double prod = 1;
        for(int num : nums){
            if(num>0){
            prod *= 1;
            } else if (num<0){
                prod*= -1;
            } else {
                return 0;
            }
        }
        
        if (prod > 0){
            return 1;
        } else {
            return -1;
        }
    }
}