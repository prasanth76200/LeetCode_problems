class Solution {
    public int[] sortedSquares(int[] nums) {
        
//         int[] arr= new int[nums.length];
        
//         for(int i=0;i<nums.length;i++){
//             arr[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(arr);
        
//         return arr ;
        
        int i=0;
        int j=nums.length-1;
        int l=nums.length-1;
        int [] arr=new int[nums.length];
        while(i<=j){
            int sqrt1 = nums[i]*nums[i];
            int sqrt2 = nums[j]*nums[j];
            
            if(sqrt1<sqrt2){
                arr[l--]=sqrt2;
                j--;
            }else{
                arr[l--]=sqrt1;
                i++;
            }
            
            
            
            
        }
        return arr;
        
    }
}