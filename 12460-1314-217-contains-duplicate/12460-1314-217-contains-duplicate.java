class Solution {
    
    Set<Integer> set = new HashSet<>();
    
    public boolean containsDuplicate(int[] nums) {
        
        for(int a : nums){
            
            if(!set.add(a)){
                return true;
            }
            
            set.add(a);
        }
        return false;
        
    }
}