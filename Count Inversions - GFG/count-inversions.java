//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static long merge(long[] nums, int l, int mid, int r){
        long[] ans = new long[r - l + 1];
        int ptr1 = l, ptr2 = mid + 1, ptr3 = 0;
        long count = 0;
        
        while(ptr1 <= mid && ptr2 <=r){
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
        
        for(int i = l; i <= r; i++ ){
            nums[i] = ans[i-l];
        }
        
        return count;
    }
    
    static long mergeSort(long[] nums, int l, int r){
        if(l == r) return 0;
        int mid = (l + r) / 2;
        long left = mergeSort(nums, l, mid);
        long right = mergeSort(nums, mid+1, r);
        long count = merge(nums, l, mid, r);
        
        return left + right + count;
    }
    static long inversionCount(long arr[], long N)
    {
        return mergeSort(arr, 0, arr.length - 1);
    }
}