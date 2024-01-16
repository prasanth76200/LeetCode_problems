class Solution {
    public int findMin(int[] nums) {
       
        int start=0,end=nums.length-1;
        
        while(start<end){
        int mid=start+(end-start)/2;
            
        if(nums[start]<nums[end]){
            return nums[start];
        }
         if(nums[mid]>=nums[mid+1]) {
           return nums[mid+1];
        } 
            else if(nums[mid]>=nums[start]){
                start=mid+1;
            }
            else{
                end=mid;
            }
            
        }
        return nums[start];
    }
}
