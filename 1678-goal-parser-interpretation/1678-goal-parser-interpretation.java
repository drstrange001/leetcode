class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        int i=0;
        while(i<command.length()){
            
            if (command.charAt(i)=='G'){
                ans.append('G');
            } else if (command.charAt(i)=='(' && command.charAt(i+1)=='a' && command.charAt(i+2)=='l'){
                ans.append("al");
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                ans.append('o');
            }
            
            i++;
        }
        return ans.toString();
    }
}