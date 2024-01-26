class Solution {
    public int maxProfit(int[] prices) {
        
     

        int leastprice = prices[0];
        int maxProfit =0;
        
        for(int i=1; i<prices.length; i++){
            int currentPrice=prices[i];
            
            if(currentPrice < leastprice){
              leastprice=currentPrice;      
            }
            else {
                int profit = currentPrice - leastprice;    
              if(profit>maxProfit){
                  maxProfit= profit;
              }
            }  
            
    
        }
        
        
            
        
        return maxProfit;
    }
}