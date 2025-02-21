class Solution {
   
public static  boolean isPalindrome(String s) {

    if("".equals(s)) return true;

  String ans =   numericToNonAlphanumeric(s);

  // System.out.println(ans); 

  boolean yesOrNot = toCheckIsPalidrome(ans);

  // System.out.println(yesOrNot);
    
    return yesOrNot;
            
              
    }
    
    private static boolean toCheckIsPalidrome(String ans) {
      
        int i=0,j=ans.length()-1;

      while(i<j){
        if (ans.charAt(i)!= ans.charAt(j)) {
            return false;            
        }else{
            i++;
            j--;
        }
      }
      return true;
  }
  
  private static String numericToNonAlphanumeric(String s) {

        String newString = s.trim().replaceAll("[^a-zA-Z0-9]", "");
        return newString.toLowerCase();
      
  }

}

