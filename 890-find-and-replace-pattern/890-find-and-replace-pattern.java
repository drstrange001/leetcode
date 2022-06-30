class Solution {
    
    public boolean isMatchingPattern(String word, String pattern){
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<word.length();i++){
            char wch=word.charAt(i);
            char pch=pattern.charAt(i);
            
            if(map.containsKey(pch)==true){
                if(map.get(pch) != wch) return false;
            } else{
                if(set.contains(wch)) return false;
                set.add(wch);
                map.put(pch,wch);
            }
            
        }
        return true;
    }
    
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res= new ArrayList<>();
        for(String word : words){
            if(isMatchingPattern(word,pattern)){
                res.add(word);
            }
        }
        return res;
    }
}