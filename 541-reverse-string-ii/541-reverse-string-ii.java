class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        for(int j=0;j<sb.length();j+=2*k){
            int lo=j;
            int hi= (int) Math.min(j+k,s.length())-1;
            while(lo<hi){
                char temp=sb.charAt(lo);
                sb.setCharAt(lo,sb.charAt(hi));
                sb.setCharAt(hi,temp);
                lo++;
                hi--;
            }
        }
        return sb.toString();
    }
}