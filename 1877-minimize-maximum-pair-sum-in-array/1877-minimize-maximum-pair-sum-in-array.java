class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int result = 0;
        int i=0,j=nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            result = Math.max(sum,result);
            i++;
            j--;
        }
        // return result;
//         int n = nums.length;
        
//         for(int i=0;i<n/2;++i){
//             result = Math.max(result,nums[i] + nums[n- i -1]);
//         }
        return result;
        
    }
}