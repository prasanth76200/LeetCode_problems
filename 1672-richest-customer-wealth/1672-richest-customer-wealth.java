class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int row = 0; row < accounts.length; row++) {
            int currentCustomerWealth = 0; 
            for (int col = 0; col < accounts[row].length; col++) {
                currentCustomerWealth += accounts[row][col];
            }
            if(ans<=currentCustomerWealth){
                ans=currentCustomerWealth;
                
            }
        }
        return ans;
    }
}
