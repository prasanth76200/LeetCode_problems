class Solution {
    public int numberOfSteps(int num) {
        return numberOfStepsHelper(num, 0);
    }

    private int numberOfStepsHelper(int num, int steps) {
        if (num == 0) {
            return steps;
        } else if (num % 2 == 0) {
            return numberOfStepsHelper(num / 2, steps + 1);
        } else {
            return numberOfStepsHelper(num - 1, steps + 1);
        }
    }
}
