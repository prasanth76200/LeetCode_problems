class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int result = 0;
        int i=0,j=nums.length-1;
        while(i<=j){
            int sum = nums[i]+nums[j];
            result = Math.max(sum,result);
            i++;
            j--;
        }
        return result;
        
    }
}