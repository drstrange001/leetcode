//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().zigZag(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    void swap (int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    
    void zigZag(int arr[], int n) {
        
        for(int idx = 0; idx < n; idx = idx + 2){
            
            if((idx - 1) >= 0 && arr[idx - 1] < arr[idx] ){
                swap(arr, idx - 1, idx);
            }
            
            if((idx + 1) < n && arr[idx] > arr[idx + 1] ){
                swap(arr, idx, idx + 1);
            }
        }
    }
}