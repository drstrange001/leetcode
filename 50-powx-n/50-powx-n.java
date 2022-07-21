class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        double ans;
        if(n<0){
            if(n==Integer.MIN_VALUE){
                ans=power(x,-(n+1));
                return 1/(ans*x);
            } else {
                ans=power(x,-(n));
                return 1/ans;
            }
        }
    
        return power(x,n);
    }
    
    public static double power(double x, int n){
        if(n==0) return 1;
        double ans=power(x,n/2);
        if(n%2==0){
            return ans*ans;
        } else {
            return ans*ans*x;
        }
    }
}