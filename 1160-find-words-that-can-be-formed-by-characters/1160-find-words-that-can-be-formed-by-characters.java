class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int[] arr = new int[26];
        
        for(int i=0;i<chars.length();i++){
         char a = chars.charAt(i);                                                           ///[2,1,1,1]
            arr[a -'a'] ++;
        }
        int count =0;
        for(String s : words){
            
            if(isFoundChars(s,arr)){
                count+=s.length();
            }

        }
        return count;

    }
    
    private boolean isFoundChars(String s,int[] arr){
        int[] arr1 = new int[26];
        
        for(char b :s.toCharArray() ){
            arr1[b -'a']++;
            
            if(arr1[b-'a']> arr[b -'a']  ){      // [3,1,1]             [2,1,1,1]
                return false;
            }
            
        }        
        return true;
    }
    
}