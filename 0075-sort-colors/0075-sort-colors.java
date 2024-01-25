class Solution {
    public void sortColors(int[] nums) {
        int i = 0,start=0,end=nums.length-1;
        while(i<=end){
            if(nums[i]==0){
                swap(nums,i,start);
                i++;
                start++;
            }
            else if(nums[i]==2){
                swap(nums,i,end);
                    end--;
                
            }
            else i++;
        }
       
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
