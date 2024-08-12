class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int[] arr = new int[26];
        for(int i=0;i<chars.length();i++){
            arr[chars.charAt(i)- 'a']++;
        }
        int count=0;
        for(String s : words){
            
            if(isCharsMatches(arr,s)){
                count+=s.length();
                
            }
        }
        
        return count;
        
        
    }
    private static boolean isCharsMatches(int[] arr1,String str){
        int[] chars = new int [26];
        for(int i=0;i<str.length();i++){
            char x =str.charAt(i);
            chars[x -'a']++;
            
            if(chars[x -'a']  > arr1[x -'a']){
                return false;
            }
        }
        
        return true;
    }
    
}