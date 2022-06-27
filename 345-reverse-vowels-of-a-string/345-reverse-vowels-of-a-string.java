class Solution {
    public static boolean isVowel(char[] arr, int i){
        char temp=arr[i];
        if(temp=='a' || temp=='e' || temp=='i' || temp=='o'|| temp=='u' ||
          temp=='A' || temp=='E' || temp=='I' || temp=='O'|| temp=='U') return true;
        return false;
    }
    
    public static char[] swap(char[] arr, int i, int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    } 
    
    public String reverseVowels(String s) {
        char[] arr= s.toCharArray();
        int i=0;
        int j=arr.length-1;
        
        while(i<j){
            while(i<j && isVowel(arr,i)==false) i++;
            
            while(i<j && isVowel(arr,j)==false) j--;
                  
            swap(arr, i, j);
            i++;
            j--;
        }
        String str="";
        for(char ch : arr) str+=ch;
        return str;
    }
}