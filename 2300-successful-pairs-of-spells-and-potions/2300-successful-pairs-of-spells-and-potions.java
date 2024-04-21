

class Solution {
    public int getPairCount(int[] potions, int spell, long target) {
        int n = potions.length;
        int bestIdx = n;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long product = (long) spell * potions[mid];
            
            if (product >= target) {
                bestIdx = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (n - bestIdx);
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int[] ans = new int[n];

        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            ans[i] = getPairCount(potions, spells[i], success);
        }

        return ans;
    }
}
