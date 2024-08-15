class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int totalTime = 0;
        
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                // For persons at or before index k, they need to buy all their tickets
                totalTime += Math.min(tickets[i], tickets[k]);
            } else {
                // For persons after index k, they will buy all their tickets
                totalTime += Math.min(tickets[i], tickets[k]-1);
            }
        }
        
        return totalTime;
    }
}
