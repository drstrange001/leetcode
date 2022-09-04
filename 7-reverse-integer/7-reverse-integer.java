class Solution {
    public int reverse(int x) {
        int rev=0;
        int temp=x;
        while(temp!=0){
            int d=temp%10;
            if((rev>Integer.MAX_VALUE/10)||(rev<Integer.MIN_VALUE/10))
                return 0;
            rev=(rev*10)+d;
            temp/=10;
        }
        return rev;
    }
}