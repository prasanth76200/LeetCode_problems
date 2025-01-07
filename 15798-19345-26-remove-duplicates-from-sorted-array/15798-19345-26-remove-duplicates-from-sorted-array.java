class Solution {
    public int removeDuplicates(int[] nums) {
        
       int curr=Integer.MIN_VALUE;
        
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(curr!=nums[i]){
                nums[p++] = nums[i];
                curr = nums[i];
            }
          
        }
        
        return p;
    }
}