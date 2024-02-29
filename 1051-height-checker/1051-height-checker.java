class Solution {
    public int heightChecker(int[] heights) {
     //[1,1,4,2,1,3]
     //[1,1,1,2,3,4]
     //     *   * *
        int result=0;
        int currentHeight=0;
        int [] freq =new int [101];
        for( int height:heights){
            freq[height]++;
        }
        for(int i=0;i<heights.length;i++){
            while(freq[currentHeight]==0){
               currentHeight++;
            }
            if(currentHeight!=heights[i]){
                result++;
            }
            freq[currentHeight]--;
        }
        return result;
        
    }
}
