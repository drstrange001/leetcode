class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxImpact=0;
        int chunk=0;
        for(int i=0;i<arr.length;i++){
            maxImpact=Math.max(arr[i],maxImpact);
            if(maxImpact==i) chunk++;
        }
        return chunk;
    }
}