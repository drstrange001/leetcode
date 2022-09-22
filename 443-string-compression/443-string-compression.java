class Solution {
    public int compress(char[] chars) {
        int i=0;
        int idx=0;
        int j=0;
        while(i<chars.length){
            if(j<chars.length && chars[i]==chars[j]){
                j++;
            }
            else {chars[idx]=chars[i];
            idx++;
            if ((j-i)>1){
                String charss=""+(j-i);
                for(int c=0;c<charss.length();c++){
                    char ch=charss.charAt(c);
                    chars[idx]=ch;
                    idx++;
                }
            }
            i=j;
        }
        }
        return idx;
    }
}