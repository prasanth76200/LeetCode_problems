class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int light =0;
        int heavy = people.length-1;
        int result =0;
        
        while(light<=heavy){
            
            int sum = people[light]+people[heavy];
            if(sum<=limit){
                light++;
            }
            heavy--;
            result++;
            
        }
        return result;
        
    }
}