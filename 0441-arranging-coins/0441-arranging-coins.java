class Solution {
    public int arrangeCoins(int n) {
        if (n == 1 || n == 0) return n;
        long s = 1, e = n;

        while (s <= e) {
            long mid = s + (e - s) / 2;
            long coins = mid * (mid + 1) / 2;
            
            if (n == coins) return (int) mid;
            
            if (n < coins) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        
        return (int) e;
    }
}
