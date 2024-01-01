class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // Step 1: Flip horizontally
        for (int[] row : image) {
            int left = 0;
            int right = row.length - 1;

            while (left < right) {
                // Swap elements at left and right positions
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;

                // Move the pointers towards the center
                left++;
                right--;
            }
        }

        // Step 2: Invert colors
        for (int[] row : image) {
            for (int i = 0; i < row.length; i++) {
                // Invert the color: 0 becomes 1, and 1 becomes 0
                row[i] = row[i] == 0 ? 1 : 0;
            }
        }

        return image;
    }
}
