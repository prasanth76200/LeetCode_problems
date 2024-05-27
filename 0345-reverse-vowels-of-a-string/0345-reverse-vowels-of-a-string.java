class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        String vowel = "aeiouAEIOU";
        
        while(i<j){
            
            while(i<j && vowel.indexOf(arr[i])==-1 ){
                i++;
            }
            
            while(i<j && vowel.indexOf(arr[j])==-1){
                j--;
            }
            
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
            
        }
        
        String word = new String(arr);
        return word;
        
        
    }
}