class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums==null || nums.length < 4){
            return result;
        }
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
            int l = j+1;
            int r = n-1;
            while(r>l){
                long sum = (long)nums[i]+nums[j] + nums[l] + nums[r];
                if(sum<target){
                    l++;
                }
                else if(sum>target){
                    r--;
                }
                else if(sum==target){
                    result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r--;
                    }
                }
             }
            }
        }
        return result;
    }
}