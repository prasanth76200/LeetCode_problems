class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
         int[] balcount = new int[26];
        for(char a:text.toCharArray()){
            count[a-'a']++;
        }
        for(char b:"balloon".toCharArray()){
            balcount[b-'a']++;
        }
        int Min = text.length();
        for(char c:"balloon".toCharArray()){
            Min=Math.min(Min,count[c-'a']/balcount[c-'a']);
        }
        return Min;
    }
}