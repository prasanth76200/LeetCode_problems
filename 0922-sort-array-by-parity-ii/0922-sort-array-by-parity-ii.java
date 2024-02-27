class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
     int[] arr=new int[nums.length];
        int even=0;
        int odd=1;
        for(int num:nums){
            if(num%2==0){
                arr[even]=num;
                    even+=2;
            }
            else{
                arr[odd]=num;
                odd+=2;
            }
        }
        return arr;
    }
}