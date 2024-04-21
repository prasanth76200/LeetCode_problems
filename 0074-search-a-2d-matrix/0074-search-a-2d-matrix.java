public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int beg = 0;
        int end = m * n - 1;
        
        while (beg < end) {
            int mid = (beg + end) / 2;
            if (matrix[mid / n][mid % n] < target) {
                beg = mid + 1;
            } else {
                end = mid;
            }
        }
        
        return matrix[beg / n][beg % n] == target;
    }
}
