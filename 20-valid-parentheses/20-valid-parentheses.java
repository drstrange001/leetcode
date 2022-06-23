class Solution {
    public boolean isValid(String s) {
        int n = s.length()-1;
        Stack<Character> st = new Stack<>();
       
        for(int i = 0;i <= n; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }else if(c == ')'){
                boolean ans = check(st, '(');
                if (ans == false)
                     return false;
            } else if(c == '}'){
                  boolean ans = check(st,'{');
                     if (ans == false)
                     return false;
            } else if(c == ']'){
                 boolean ans = check(st,'[');
                     if (ans == false)
                     return false;
            }
        }
       
        if (st.size() == 0) return true;
        else return false;
    }
   
    public static boolean check(Stack<Character> st, char oc){
                if(st.size() == 0){
                    return false;
                } else if(st.peek() != oc) {
                    return false;
                } else {
                    st.pop();
                    return true;
                }
    }
}