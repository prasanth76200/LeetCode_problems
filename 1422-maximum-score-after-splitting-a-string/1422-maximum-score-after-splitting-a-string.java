class Solution {
    public int maxScore(String s) {

        // 011101
        
        int max =0;
        
        for(int i=0;i<s.length();i++){
           
               for(int j=1;j<s.length();j++){ 
                     int counti =0;
                    int countj =0;
                  // Count '0's in the left part
                for (int k = 0; k < j; k++) {
                    if (k < i && s.charAt(k) == '0') {
                        counti++;
                    }
                }

                // Count '1's in the right part
                for (int k = j; k < s.length(); k++) {
                    if (s.charAt(k) == '1') {
                        countj++;
                    }
                }
     
         int sum = counti +countj;
        if(max < sum){
            max = sum;
        }
            }
      
        }
        
           
        return max;
        
    }
}