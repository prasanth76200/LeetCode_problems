class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] post = new int[n];
        
        // Initialize pre and post arrays with 1
        pre[0] = 1;
        post[n - 1] = 1;
        
        // Calculate prefix products
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        
        // Calculate postfix products
        for (int i = n - 2; i >= 0; i--) {
            post[i] = post[i + 1] * nums[i + 1];
        }
        
        // Calculate final result
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * post[i];
        }
        
        return ans;
    }
}
