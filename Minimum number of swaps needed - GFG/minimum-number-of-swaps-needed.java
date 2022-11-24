//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countSwaps(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    int merge(int[] nums, int l, int mid, int r){
        int[] ans = new int[r - l + 1];
        int ptr1 = l; int ptr2 = mid + 1; int ptr3 = 0;
        int count = 0;
        
        while(ptr1 <= mid && ptr2 <= r){
            if(nums[ptr1] <= nums[ptr2]){
                ans[ptr3] = nums[ptr1];
                ptr1++; ptr3++;
            } else {
                count += (mid - ptr1 + 1);
                ans[ptr3] = nums[ptr2];
                ptr3++; ptr2++;
            }
        }
        
        while(ptr1 <= mid){
            ans[ptr3] = nums[ptr1];
            ptr3++; ptr1++;
        }
        
        while(ptr2 <= r){
            ans[ptr3] = nums[ptr2];
            ptr2++; ptr3++;
        }
        
        for(int i = l; i <= r; i++){
            nums[i] = ans[i - l];
        }
        
        return count;
    }
    
    int mergeSort(int[] nums, int l, int r){
        if(l == r) return 0;
        int mid = (l + r) / 2;
        int left = mergeSort(nums, l, mid);
        int right = mergeSort(nums, mid+1, r);
        int count = merge(nums, l, mid, r);
        
        return left + right + count;
    }
    int countSwaps(int arr[], int n) {
        return mergeSort(arr, 0, n-1);
    }
}