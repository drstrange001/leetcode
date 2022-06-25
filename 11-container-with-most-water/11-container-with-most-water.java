class Solution {
    public int maxArea(int[] height) {
        
        int i=0;
        int j=height.length-1;
        int water=0;
        while(i<j){
            int h= Math.min(height[i],height[j]);
            int width= j-i;
            water= Math.max(water, h*width);
            
            if(height[i]<height[j]){
                i++;
            } else j--;
        }
        return water;
    }
}