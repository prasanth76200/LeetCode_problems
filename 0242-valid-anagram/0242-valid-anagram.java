class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1 = new int[26];
        for(char a:s.toCharArray()){
            freq1[a-'a']++;
        }
        for(char b:t.toCharArray()){
            freq1[b-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=0) return false;
        }
        return true;
    }
}