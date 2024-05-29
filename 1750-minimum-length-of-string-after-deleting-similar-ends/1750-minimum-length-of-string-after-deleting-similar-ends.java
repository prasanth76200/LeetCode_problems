class Solution {
    public int minimumLength(String s) {
        char[] arr = s.toCharArray();
        
        int i = 0, j = arr.length - 1;
        
        // While loop to remove identical characters from both ends
        while (i < j && arr[i] == arr[j]) {
            char ch = arr[i];
            // Move the left pointer to the right as long as characters are the same as the current character
            while (i <= j && arr[i] == ch) {
                i++;
            }
            // Move the right pointer to the left as long as characters are the same as the current character
            while (i <= j && arr[j] == ch) {
                j--;
            }
        }
        
        // The remaining length of the string
        return j - i + 1;
    }
}
