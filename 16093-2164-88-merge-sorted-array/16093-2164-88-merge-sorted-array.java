class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Edge case: If nums1 is empty, copy nums2 directly
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        int i = m - 1; // Last valid element in nums1
        int j = n - 1; // Last element in nums2
        int p = m + n - 1; // Last position in nums1

        // Merge nums1 and nums2 from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[p] = nums1[i];
                i--;
            } else {
                nums1[p] = nums2[j];
                j--;
            }
            p--;
        }

        // Copy any remaining elements of nums2 (if any)
        while (j >= 0) {
            nums1[p] = nums2[j];
            j--;
            p--;
        }
    }
}
