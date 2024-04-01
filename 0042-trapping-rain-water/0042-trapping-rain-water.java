class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxLeft = 0, maxRight = 0;
        int left = 0, right = n - 1;
        int count = 0;

        while (left < right) {
            maxLeft = Math.max(maxLeft, height[left]);
            maxRight = Math.max(maxRight, height[right]);

            if (maxLeft < maxRight) {
                count += maxLeft - height[left];
                left++;
            } else {
                count += maxRight - height[right];
                right--;
            }
        }
        return count;
    }
}
