class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        
        int indx1 = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                indx1 = i;
                break;
            }
        }
        if (indx1 == -1) {
            return -1;
        }
        
        int indx2 = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[indx1] < arr[i]) {
                indx2 = i;
                break;
            }
        }
        
        swap(arr, indx1, indx2);
        reverse(arr, indx1 + 1, arr.length - 1);
        
        long val = Long.parseLong(new String(arr));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }
    
    void swap(char[] arr, int first, int second) {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    void reverse(char[] arr, int first, int second) {
        while (first < second) {
            swap(arr, first, second);
            first++;
            second--;
        }
    }
}
