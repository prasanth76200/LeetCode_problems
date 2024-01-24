class Solution {
    public void rotate(int[] nums, int k) {
      k=k%nums.length;
        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
        
        
        
    }
  
    public void swap(int[] nums, int first, int second){
     while(first<second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
         first++;
         second--;
     }
        
    }
}