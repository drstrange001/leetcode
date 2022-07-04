class Solution {
    public int minAddToMakeValid(String s) {
        int count1=0;
        int ans=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('){
                count1++;
            } else {
                if(count1>0) count1--;
                else ans++;
                
            }
        }
        
        return ans+count1;
    }
}