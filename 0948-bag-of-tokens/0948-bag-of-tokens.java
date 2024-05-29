class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        int maxScore = 0;
        int score =0;
        Arrays.sort(tokens);
        
        int i=0,j=tokens.length-1;
        
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i];
                i++;
                score++;
                maxScore = Math.max(maxScore,score);
                
            }else if(score>0){
               power+=tokens[j];
                j--;
                score--;
            }
            else{
                return maxScore;
            }
            
        }
         return maxScore;
    }
}