class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            char a = s.charAt(i);
            if(a!=' '){
                count++;
            }else{
                if(count>0) return count;
            }
            
        }
        return count;
    }
}