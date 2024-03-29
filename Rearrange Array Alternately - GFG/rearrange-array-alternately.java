//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException
	{

// 		Scanner in = new Scanner(System.in);
        
// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
         //testcases
        int t = Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
		    //size of array
		    int n = Integer.parseInt(read.readLine());
		    long[] arr= new long[n];
		    
		    String str[] = read.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0;i<n;i++)
		        arr[i] = Long.parseLong(str[i]);
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    Solution ob = new Solution();
		    
		    //calling rearrange() function
		    ob.rearrange(arr, n);
		    StringBuffer sb = new StringBuffer();
		    
		    //appending and printing the elements
		    for(int i =0; i < n; i++)
		     sb.append(arr[i] + " ");
		    System.out.println(sb);
		}
	}
}




// } Driver Code Ends


class Solution{
    
   public static void minMaxSort(long[] nums, int n){
       long[] sorted = new long[n];
       int idx = 0, left = 0, right = n - 1;
       for(long val : nums) sorted[idx++] = val;
       
       for(idx = 0; idx < n; idx++){
           if(idx % 2 != 0){
               nums[idx] = sorted[left++];
           } else {
               nums[idx] = sorted[right--];
           }
       }
   }
   
   public static void quotientRemainder(long[] nums, int n){
       long max = 10000007;
       int left = 0, right = n - 1;
       
       for(int idx = 0; idx < n; idx++){
           long oldVal = nums[idx]; 
           long newVal = (idx % 2 == 0)
                         ? nums[right--] % max
                         : nums[left++] % max;
                         
            nums[idx] = oldVal + (newVal % max) * max;
       }
       
       for(int idx = 0; idx < n; idx++){
           nums[idx] = nums[idx] / max;
       }
   }
   
    public static void rearrange(long arr[], int n){
        //minMaxSort(arr, n);
        quotientRemainder(arr, n);
    }
    
}


