class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);
        int res=0;
        for(int i=0;i<nums.length;i++){
            int count=1;
            int num=nums[i];
            while(set.contains(--num)){
                count++;
                set.remove(num);
            }
             num=nums[i];
            while(set.contains(++num)){
                count++;
                set.remove(num);
            }
            res=Math.max(res,count);
        }
        return res;
    }
}