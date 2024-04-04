class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int i=0;
        int count=0;
        while(i<flowerbed.length){
            if((i==0 || flowerbed[i-1]==0) &&flowerbed[i]==0 &&(i==flowerbed.length-1 ||  flowerbed[i+1]==0))
            
            {
               flowerbed[i]=1;
                count++;
            
        }
            i++;
        }
        return count>=n;
        
    }
}