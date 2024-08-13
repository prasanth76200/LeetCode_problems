class Solution {
    public String largestGoodInteger(String num) {
        
                String result ="";
        
        for(int i=0;i<=num.length()-3;i++){
            char a = num.charAt(i);
            if(a == num.charAt(i+1)&& a==num.charAt(i+2)){
                String tripllets = "" +a+a+a;
                
                if (tripllets.compareTo(result)>0){
                     result= tripllets; 
                }
            }
            
            
            
        }
        
        return result;
        
    }
}