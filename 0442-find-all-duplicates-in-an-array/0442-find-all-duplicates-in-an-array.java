class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       
        int i=0;
        
            while(i<nums.length){
                int crt = nums[i]-1;
                if(nums[i]!=nums[crt]){
                    swap(nums, i, crt);
                }
                else{
                    i++;
            }
        }
          List<Integer> list = new ArrayList<>();
        for(int index=0; index<nums.length; index++){
            if(nums[index]!=index+1){
                list.add(nums[index]);
                
            }
        }
      return list;
    }
     static void swap(int[] nums, int first,int second){

        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}