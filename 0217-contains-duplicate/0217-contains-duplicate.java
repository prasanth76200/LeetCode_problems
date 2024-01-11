class Solution {
    public boolean containsDuplicate(int[] nums) {
       
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (!set.add(num)) {
                return true; // If the element is already in the set, it's a duplicate
            }
        }
        
        return false;
    }
}