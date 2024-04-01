class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
       int maxWidth=0;
        while(left<right){
            int area=Math.min(height[left],height[right])* (right-left);
          maxWidth=Math.max(maxWidth,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            
        }
        return maxWidth;
        
    }
}