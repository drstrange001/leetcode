class Solution {
    HashMap<Character,Integer> hm; 
public boolean isAlienSorted(String[] words, String order) {
    hm =new HashMap<>();
    
    for(int i=0;i<order.length();i++){
        hm.put(order.charAt(i),i);
    }
    for(int i=0;i<words.length-1;i++){
        if(!compare(words[i],words[i+1])) return false;
    }
    return true;
}
    
public boolean compare(String s1,String s2){
    int l1=s1.length();
    int l2=s2.length();
    
    for(int i=0,j=0;i<l1&&j<l2;i++,j++){
        char c1=s1.charAt(i);
        char c2=s2.charAt(j);
        if(c1!=c2){
           if(hm.get(c1)>hm.get(c2)){
                return false;
             }else{
                 return true;
               }
          }
       }
    if(l1>l2) return false;
    return true;
}
}
