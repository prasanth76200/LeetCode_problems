class Solution {
    public int maxProfit(int[] prices) {
        
   int max =0;
    int i=0,j=1;
        
        while(j<prices.length){
            
            if(prices[j]>prices[i]){
                 max = Math.max(max,prices[j] - prices[i]);
                
            }else{
                i=j;
            }
            j++;
            
              
        }
  return max;
    }
    
    
}