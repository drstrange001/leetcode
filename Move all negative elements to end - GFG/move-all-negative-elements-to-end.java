//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void approach1(int arr[], int n)
    {
       int[] res = new int[arr.length];
       int left = 0, right = arr.length - 1;
       
       for(int idx = 0; idx < arr.length; idx++){
           if(arr[idx] >= 0)
           res[left++] = arr[idx];
       }
       
       for(int idx = arr.length - 1; idx >= 0; idx--){
           if(arr[idx] < 0){
               res[right--] = arr[idx];
           }
       }
       
       for(int idx = 0; idx < res.length; idx++){
           arr[idx] = res[idx];
       }
    }
    
    public void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++; right--;
        }
    }
    
    public void merge(int[] nums, int left, int mid, int right){
        int p1 = left;
        while(p1 <= mid && nums[p1] >= 0) p1++;
        
        int p2 = mid + 1;
        while(p2 <= right && nums[p2] >= 0) p2++;
        
        reverse(nums, p1, mid);
        reverse(nums, mid + 1, p2 - 1);
        reverse(nums, p1, p2 - 1);
    }
    
    public void mergeSort(int[] nums, int left, int right){
        if(left == right) return;
        
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
        
    }
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        mergeSort(arr, 0, n - 1);
    }
}