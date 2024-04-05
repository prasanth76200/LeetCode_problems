class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int a:nums){
            sum+=a;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum = sum-nums[i]-leftSum;
            if(rightSum==leftSum){
                return i;
            }
            leftSum+=nums[i];
        }
 return -1;       
    }
}