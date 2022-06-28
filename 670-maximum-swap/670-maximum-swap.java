class Solution {
    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int maximumSwap(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int[] li = new int[10];
        int i = 0;
        for(i = 0; i < arr.length; i++){
            int digit = arr[i] - '0';
            li[digit] = i;
        }
        boolean flag = false;
        for(i = 0; i < arr.length; i++){
            int digit = arr[i] - '0';
            for(int j = 9; j > digit; j--){
                if(i < li[j]){
                    swap(arr, i, li[j]);
                    flag = true;
                    break;
                }
            }
            if(flag == true) break;
        }
        String ans = "";
        for(i = 0; i < arr.length; i++){
            ans = ans + arr[i];
        }
       int res = Integer.parseInt(ans);
        return res;
    }
}