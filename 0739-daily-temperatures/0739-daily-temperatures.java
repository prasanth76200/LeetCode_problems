class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        Stack<Integer>stack= new Stack<>();
        
        for(int curr=0;curr<temperatures.length;curr++){
            
            while(!stack.isEmpty()&&temperatures[curr]>temperatures[stack.peek()]){
                
                int prevDay = stack.pop();
                arr[prevDay] = curr - prevDay;
                
                
            }
            
            stack.push(curr);
        }
        
        return arr;
    }
}