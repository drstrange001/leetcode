class Solution {
    public int nextGreaterElement(int n) {
        String str=Integer.toString(n);
        char[] nums=str.toCharArray();
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i==-1) return -1;
        int j=nums.length-1;
        while(nums[i]>=nums[j]){
            j--;
        }
        char temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
        String ans="";
        for(int k=0;k<=i;k++){
            ans += nums[k];
        }
        
        for (int l=nums.length-1; l>i; l--){
            ans+=nums[l];
        }
        try{
        int f=Integer.parseInt(ans);
        return f;
        } catch (Exception e){
            return -1;
        }
    }
}