class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr=new int[n];
        int curr=1;
        Arrays.fill(arr,1);
        for(int i=0;i<n;i++){
            arr[i]*=curr;
            curr*=nums[i];
        }
        curr=1;
        for(int i=n-1;i>=0;i--){
            arr[i]*=curr;
            curr*=nums[i];
        }
        return arr;
    }
}
