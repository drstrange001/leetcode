class Solution {
    public int maxChunksToSorted(int[] arr) {
        int[] rmin= new int[arr.length+1];
        rmin[arr.length]= Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            rmin[i]=Math.min(rmin[i+1],arr[i]);
        }
        
        int leftMax=Integer.MIN_VALUE;
        int chunk=0;
        
        for(int j=0; j<arr.length;j++){
            leftMax=Math.max(leftMax,arr[j]);
            if(leftMax<=rmin[j+1]) chunk++;
        }
        return chunk;
    }
}