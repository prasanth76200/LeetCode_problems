class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        
        int i=0,j=arr.length-1;
        
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        StringBuilder string = new StringBuilder();
        
        for(String a: arr){
            string.append(a).append(" ");

        }
        
        return string.toString().trim();
    }
     void swap(String arr[], int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}