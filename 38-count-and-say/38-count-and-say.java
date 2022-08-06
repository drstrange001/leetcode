class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1"; 
        
        String nextLevel = countAndSay(n - 1);  
        
        StringBuilder curLevel = new StringBuilder();
        int fast = 0, slow = 0;
        while (slow < nextLevel.length()) {
            
            while (fast < nextLevel.length() && nextLevel.charAt(fast) == nextLevel.charAt(slow)) {
                fast++;
            }
            
            curLevel.append(fast - slow).append(nextLevel.charAt(slow));
            slow = fast;
        }
        
        return curLevel.toString();
    }
}