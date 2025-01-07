class Solution {
    public int maxFrequencyElements(int[] nums) {
   
        Map <Integer, Integer> map = new HashMap<>();
        
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        int maxCount = 0;
        
        for(int b:map.values()){
            maxCount = Math.max(b,maxCount);
        }
        
        int result = 0;
        for(int c:map.values()){
            if(c==maxCount){
                result +=maxCount;
            }
            
           
        
        }
         return result;
        
    }
}