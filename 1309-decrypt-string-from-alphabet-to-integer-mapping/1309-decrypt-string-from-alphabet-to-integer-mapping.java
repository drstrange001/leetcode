class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans= new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(i+2<s.length()&&s.charAt(i+2)=='#'){
                String temp = s.charAt(i)+""+s.charAt(i+1);
                int n=Integer.parseInt(temp);
                ans.append((char) (96+n));
                i=i+3;
            } else {
                ans.append((char) (Character.getNumericValue(s.charAt(i))+96));
                i++;
            }
        }
        return ans.toString();
    }
}

  