class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        
        int i=0,j=people.length-1;
        int min =0;
        while(i<=j){
            int sum = people[i] + people[j];
            
            if(sum <= limit){
                i++;
            }
            min++;
            j--;
            
         
            
            
        }
        
        
        return min;
        
        
        
    }
}