class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> CharSet =new HashSet<>();
        int left=0;
        int maxChar=0;
        for(int right=0;right<s.length();right++){
            if(!CharSet.contains(s.charAt(right))){
                CharSet.add(s.charAt(right));
                maxChar=Math.max(maxChar,right-left+1);
            }else{
                while(CharSet.contains(s.charAt(right))){
                    CharSet.remove(s.charAt(left));
                    left++;
                }
               CharSet.add(s.charAt(right));
            }
            
        }
        
        return maxChar;
    }
}

