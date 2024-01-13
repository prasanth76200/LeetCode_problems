class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int crt = nums[i];
            if (crt <= nums.length && nums[crt - 1] != crt) {
                swap(nums, i, crt - 1);
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                list.add(index + 1);
            }
        }

        return list;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
