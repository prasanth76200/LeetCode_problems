class Solution {
    public void rotate(int[] nums, int k) {
    
            k = k% nums.length;
            
            toreverse(nums,0,nums.length-1);
             toreverse(nums,k,nums.length-1);
            toreverse(nums,0,k-1);
      
        
            
        
        
    }
    
    
    private void toreverse(int[] nums,int first,int second){
        
        while(first<second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
            first++;
            second --;
        }
        
        
    }
    
}