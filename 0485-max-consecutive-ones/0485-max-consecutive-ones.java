class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int MaxNum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                MaxNum=Math.max(count,MaxNum);
            }
            else if(nums[i]==0){
                count=0;
            }
        }
      return MaxNum;  
        
    }
}