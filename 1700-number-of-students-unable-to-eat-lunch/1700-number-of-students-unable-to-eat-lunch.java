class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int count : students){
                   map.put(count, map.getOrDefault(count,0)+1);
        }
        
        for (int sandwich : sandwiches) {
 
            if (map.getOrDefault(sandwich, 0) == 0) {
                return map.getOrDefault(0, 0) + map.getOrDefault(1, 0);
            }
         
            map.put(sandwich, map.get(sandwich) - 1);
        }
        
        return 0;
        
        
    }
}