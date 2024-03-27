class NumArray {
int[] preComp;
    public NumArray(int[] nums) {
        preComp=nums;
        for(int i=1;i<nums.length;i++){
            preComp[i]=nums[i]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return preComp[right];
        return preComp[right]-preComp[left-1];
    }
}

