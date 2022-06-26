class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> maxImpact = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char chr = s.charAt(i);
            maxImpact.put(chr, i);
        }
        
        int prev = -1;
        int max = 0;
        List<Integer> res = new ArrayList<>();
        for(int j = 0; j < s.length(); j++){
            char ch = s.charAt(j);
            max = Math.max(maxImpact.get(ch), max);
            if(max == j){
                res.add(max - prev);
                prev = max;
            }
        }
        return res;
    }
}