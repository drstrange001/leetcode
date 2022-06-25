class Solution {
    public int fib(int n) {
        int dp[]= new int[n+1];
        return fibDp(n,dp);
    }
    
    public int fibDp(int n, int[] dp){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        
        dp[n]=fibDp(n-1,dp)+fibDp(n-2,dp);
        return dp[n];
    }
}