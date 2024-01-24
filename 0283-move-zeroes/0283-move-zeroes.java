class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] == 0) {
                int j = i + 1;

                // Find the first non-zero element to swap with the zero
                while (j < n && nums[j] == 0) {
                    j++;
                }

                // If a non-zero element is found, swap
                if (j < n) {
                    swap(nums, i, j);
                } else {
                    // No non-zero element found, break the loop
                    break;
                }
            }

            i++;
        }
    }

    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
