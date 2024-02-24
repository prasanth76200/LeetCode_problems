class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for(int num : nums){
            max = Math.max(max,num);
        }
        int arr[] = new int[max+1];
        int dp[] = new int[max+1];
        Arrays.fill(dp,-1);
        for(int num : nums)
            arr[num]++;
        return rec(arr,1,dp);
    }
    public int rec(int[]nums,int i,int[]dp){
        if(i>=nums.length)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int nottake = rec(nums,i+1,dp);
        int take = nums[i]*i+rec(nums,i+2,dp);
        
        return dp[i] = Math.max(take,nottake);
    }
}