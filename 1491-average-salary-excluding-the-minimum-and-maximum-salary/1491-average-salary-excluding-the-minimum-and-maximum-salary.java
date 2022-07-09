class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double sum=0;
        
        for(int val: salary){
            sum=sum+val;
            min=Math.min(val,min);
            max=Math.max(val,max);
        }
        return (sum-min-max)/(salary.length-2);
    }
}