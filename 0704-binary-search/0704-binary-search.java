class Solution {
    public int search(int[] nums, int target) {
    // if(nums.length==1) return 0;
        int i=0;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(target<nums[mid]){
                end=mid-1;
               
                
            }
            else{
                 start=mid+1;
            }
            
            
        }
        return -1;
        
    }    
    
}