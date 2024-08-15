class Solution {
    public int firstUniqChar(String s) {
        int[] chars = new int [26];
        
        for(char a: s.toCharArray()){
            chars[a - 'a']++;
        }
        for (int i=0;i<s.length(); i++){
            if(chars[s.charAt(i) - 'a']==1){
                return i;
            }
            }
        return -1;
        
        }
        
        
        
    }
