class Solution {

    public String reversePrefix(String word, char ch) {
        int find = -1;
        char[] arr = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (arr[i] == ch) {
                find = i;
                break;
            }
        }
        if (find == -1) {
            return word;
        } else {
            int i = 0;
            int j = find;
            while (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        
        return new String(arr);
    }

    void swap(char arr[], int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
