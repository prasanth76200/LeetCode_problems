class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int curSum=0;
        int res=0;
        for(int i=0;i<k-1;i++){
            curSum+=arr[i];
        }
        for(int l=0;l<=arr.length-k;l++){
            curSum+=arr[l+k-1];
            if(curSum/k>= threshold){
                res++;
            }
            curSum-=arr[l];
        }
        
        
        return res;
    }
}