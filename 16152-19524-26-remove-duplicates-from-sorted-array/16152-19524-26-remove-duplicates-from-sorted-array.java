class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0,j=0;
        int k=0;
        nums[j] = nums[i];
        while(i<nums.length){
            if(i>0 && nums[i]!=nums[j]){   
                nums[j+1] = nums[i];
                j++; 
                k++;
            } 
            i++;
        }
        
        
        
        
        
     return k+1;   
        
    }
}