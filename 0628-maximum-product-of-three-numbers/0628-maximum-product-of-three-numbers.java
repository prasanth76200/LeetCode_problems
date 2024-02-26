class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int maxNum=0;
        int first=0;
        int last=0;
        for(int num:nums){
            first=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
            last=nums[0]*nums[1]*nums[nums.length-1];
            
            maxNum=Math.max(first,last);
            }
            
        
        return maxNum;
    }
}