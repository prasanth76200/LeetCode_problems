class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();
        
        int result=0;
        for(String a: operations){
            if(a.equals("+")){
                int first = stack.pop();
                int last= stack.peek();
                int sum = first+last;
                stack.push(first);
                stack.push(sum);
                result+=sum;
            }else if(a.equals("D")){
                int first = stack.peek();
                int sum=first*2;
                stack.push(sum);
                result+=sum;
            }
            else if(a.equals("C")){
               int ans =stack.pop();
                result-=ans;
            }else {
                int num = Integer.parseInt(a);
                stack.push(num);
                result += num;
            }
        }
        
        return result;
    }
}