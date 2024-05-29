class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        
        int maxScore = 0;
        int score =0;
        Arrays.sort(tokens);
        int i=0,j=tokens.length-1;
        
        while(i<=j){
            if(power >= tokens[i]){
                power -= tokens[i];
                score+=1;
                i++;
                maxScore = Math.max(maxScore,score);
                // j--;
            }else if(score>0){
                power+=tokens[j];
                score--;
                j--;
            }else {
                break;
            }
        }
        return maxScore;
        
    }
}