class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            Character first = s.charAt(i);
            Character second=s.charAt(j);
            if(!Character.isLetterOrDigit(first)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(second)){
                j--;
                continue;
            }
            
            if(Character.toLowerCase(first)!=Character.toLowerCase(second)){
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
}