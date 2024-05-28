class Solution {
    public String reversePrefix(String word, char ch) {
        int find = -1;
        char[] arr = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (arr[i] == ch) {
                find = i;
                break;  // Exit the loop once the first occurrence is found
            }
        }
        
        if (find == -1) {
            return word;  // If ch is not found, return the original word
        } else {
            int i = 0;
            int j = find;
            while (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        
        return new String(arr);  // Convert the char array back to a String
    }

    void swap(char arr[], int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
