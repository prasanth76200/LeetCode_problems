class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        // int i = 0,j=0;
        char[] arr = new char[word1.length()+word2.length()];
        int k = 0;

        // System.out.println(k-1);
        int i=0,j=0; 
        while(i<word1.length() && j<word2.length()){
            arr[k++] = word1.charAt(i);
             arr[k++] = word2.charAt(j);
             i++;
             j++;
        }
        while(i<word1.length()){
            arr[k++] = word1.charAt(i);
            i++;
         }
         while(j<word2.length()){
            arr[k++] = word2.charAt(j);
            j++;
         }
    
        return new String(arr);
    }
}