class Solution {
    public void nextPermutation(int[] nums) {
        //0,1,2,5,3,0,0
        
        int indx1= -1;
    
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                indx1=i;
                break;
            }  
        }
        
        if(indx1==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        int indx2=-1;
        for(int i=nums.length-1;i>indx1;i--){
            if(nums[indx1]<nums[i]){
                indx2=i;
                 break;
            }
            
        }
          swap(nums,indx1,indx2);
            
            reverse(nums,indx1+1,nums.length-1);
            
       }
        
    
    private void swap(int nums[],int first,int second){
     
         int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    
       
        
    }
    private void reverse(int nums[],int first,int second){
        while(first<second){
            swap(nums,first,second);
            first++;
            second--;
        }
        
    }
    
    
}