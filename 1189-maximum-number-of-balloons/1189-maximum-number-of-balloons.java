class Solution {
    public int maxNumberOfBalloons(String text) {
       int[] count=new int[26], ballCount=new int[26];
        for(int i=0;i<text.length();i++){
        count[text.charAt(i)-'a']++;
        }
        for(char a:"balloon".toCharArray()){
             ballCount[a-'a']++;
        }
        int min=text.length();
        for(char b:"balloon".toCharArray()){
             min=Math.min(min,count[b-'a']/ballCount[b-'a']);
        }
   return min;
    }
}