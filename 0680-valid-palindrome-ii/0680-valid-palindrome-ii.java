class Solution {
    public boolean validPalindrome(String s) {
        
        int i=0,j=s.length()-1;
        while(i<j){
            // char first = s.charAt(i);
            // char second = s.charAt(j);
            if(s.charAt(i) != s.charAt(j)){
                return vaildOrNot(s,i+1,j) || vaildOrNot (s,i,j-1);
            }
            i++;
            j--;
            
        }
        return true;
        
    }
    
    private boolean vaildOrNot(String s,int i,int j){
        // char first = s.charAt(i);
        // char second = s.charAt(j);
        while(i<j){
             if(s.charAt(i) != s.charAt(j)){
                return false;
            }
             i++;
            j--;
        }
            
    return true;
           
        
    }

}