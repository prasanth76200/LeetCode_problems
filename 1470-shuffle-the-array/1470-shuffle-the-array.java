class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int mid = n;
        int arry=0;

        for(int i=0; i<n; i++){
            arr[arry]=nums[i];
            arry++;
            arr[arry]=nums[mid];
            arry++;
            mid++;

        }
        return arr;
    }
}