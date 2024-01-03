
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int carry = k;

        for (int i = num.length - 1; i >= 0 || carry > 0; i--) {
            if (i >= 0) {
                carry += num[i];
            }
            result.add(carry % 10);
            carry /= 10;
        }

        Collections.reverse(result);
        return result;
    }
}
