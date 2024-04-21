class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int j=0;
        for(int i=0;i<pushed.length;i++){
            s.push(pushed[i]);
            while(!s.isEmpty() && j<popped.length){
                if(s.peek()==popped[j]){
                    s.pop();
                    j++;
                }else{
                    break;
                }
            }
        }
        return s.isEmpty();
    }
}