class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        if(nums.length==1){
            return (double)nums[0];
        }
        int sum=0;
       
        for(int i=0; i<k; i++) sum+=nums[i]; //sum the first four using slidingWindow algo
            
             int maxSum = sum;
            int startIndex = 0;
            int endIndex = k;
            
            while(endIndex<nums.length){
                sum=sum-nums[startIndex];
                startIndex++;
                
                sum=sum+nums[endIndex];
                endIndex++;
                
                maxSum=Math.max(maxSum ,sum);
            
            
        }
        
        
        return (double) maxSum/k;
    }
}