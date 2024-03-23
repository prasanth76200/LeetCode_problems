class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int[] cust:accounts){
            
            int wealth=0;
            
            for(int acc:cust){
                wealth+=acc;
            }
            
           maxWealth= Math.max(wealth,maxWealth);
        }
        return maxWealth;
    }
}