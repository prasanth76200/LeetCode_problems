class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int a:nums){
            sum+=a;
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            int rightSum = sum - nums[i] - left;
            if(left==rightSum){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}