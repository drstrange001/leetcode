class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq.containsKey(ch)){
                int cf=freq.get(ch);
                int nf=cf+1;
                freq.put(ch,nf);
            } else {
                freq.put(ch,1);
            }
        }
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(freq.containsKey(ch)&&(freq.get(ch)==1)){
                c=i;
                return c;
            } else{
                c++;
            }
        }
        
        if(c>s.length()-1) c=-1;
        return c;
    }
}