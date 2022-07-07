class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],true);
        }
        
        for(int val: nums){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
        }
        
        int ml=0;
        
        for(int val : nums){
            if(map.get(val)==true){
                int v= val;
                int tl=1;
                while(map.containsKey(v+tl)){
                    tl++;
                }
                if(tl>ml){
                    ml=tl;
                }
            }
        }
        
        return ml;
    }
}