class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int a:nums){
            set.add(a);
        }
        int p=0;
        int[] arr = new int[set.size()];
        for(int num: set){
            arr[p++]= num;
        }
        Arrays.sort(arr);
         int g=0;
        // int[] arr = new arr[set.size()];
        for(int num2: arr){
            nums[g++]= num2;
        }
        
        
        return p;
        
    }
}