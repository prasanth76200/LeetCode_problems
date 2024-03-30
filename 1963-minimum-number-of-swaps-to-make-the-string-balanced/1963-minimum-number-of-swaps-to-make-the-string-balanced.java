class Solution {
    public int minSwaps(String s) {
        int extraClosing=0;
        int max=0;
        for(char a:s.toCharArray()){
            if(a=='['){
                extraClosing-=1;
            }else{
                extraClosing+=1;
            }
            max=Math.max(extraClosing,max);
        }
        return (max+1)/2;
    }
}