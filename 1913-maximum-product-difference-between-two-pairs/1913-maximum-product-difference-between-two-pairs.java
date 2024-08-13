import java.util.Arrays;

class Solution {
    public int maxProductDifference(int[] nums) {
    
        Arrays.sort(nums);

     
        int n = nums.length;
        int maxProduct = nums[n - 1] * nums[n - 2];
        int minProduct = nums[0] * nums[1];

     
        return maxProduct - minProduct;
    }
}
