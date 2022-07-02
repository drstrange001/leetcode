class Solution {
    
    public static void solveConfig(char[] arr, int i, int j){
        if (arr[i] == 'L' && arr[j] == 'L'){
            
            //make all . to L
            for(int k = i+1; k < j; k++){
                arr[k] = 'L';
            }
            
        } else if (arr[i] == 'R' && arr[j] == 'R'){
            
            //make all . to R
            for(int k = i + 1; k < j; k++){
                arr[k] = 'R';
            }
            
        } else if (arr[i] == 'L' && arr[j] == 'R'){
            //nothing to do
                
        } else {
            
            int dif = j - i;
            int mid = (j + i) / 2;
            
            if(dif % 2 == 0){
                //odd
                for(int k = i+1; k < mid; k++){
                    arr[k] = 'R';
                }
                for(int k = mid+1; k < j; k++){
                    arr[k] = 'L';
                }
            } else{
                //even
                 for(int k = i+1; k <= mid; k++){
                    arr[k] = 'R';
                }
                for(int k = mid+1; k < j; k++){
                    arr[k] = 'L';
                }
            }
        }
        
    }
    
    public String pushDominoes(String dominoes) {
        
        int n = dominoes.length();
        char[] arr = new char[n + 2];
        
        arr[0] = 'L';
        arr[n+1] = 'R';
        
        for(int i = 1; i < arr.length - 1; i++){
            arr[i] = dominoes.charAt(i - 1);
        }
        
        int j = 0;
        int k = 1;
        
        while(k < arr.length){
            while(arr[k] == '.'){
                k++;
            }
            
            if(k - j > 1)
                solveConfig(arr, j, k);
            j = k;
            k++;
        }
        
        StringBuilder ans = new StringBuilder();
        
        for(int i = 1; i < arr.length - 1; i++){
            ans.append(arr[i]);
        }
        
        return ans.toString();
    }
}