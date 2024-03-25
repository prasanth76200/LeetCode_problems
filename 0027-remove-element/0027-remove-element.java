class Solution {
    public int removeElement(int[] nums, int val) {
      
        int index=0;
    
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[index]=nums[j];
                index++;
            }
        }
        return index;
    }
}