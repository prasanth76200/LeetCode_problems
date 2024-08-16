class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        // students = [1,1,1,1,0,0]  , sandwiches = 
        //                        [1,1,1,0,0,0] 
            // 1-4 -->1
            // 0-2 --->2
            // 1+2 =3
        
        Map<Integer,Integer> map = new HashMap<>();
        
    for(int a :students){
        map.put(a,map.getOrDefault(a,0)+1);
    }
      
    for(int sand : sandwiches){
        
        if(map.getOrDefault(sand ,0) ==0){
            
            return   map.getOrDefault(1,0)   + map.getOrDefault(0, 0);
            
            
        }else {
            map.put(sand , map.get(sand) -1);
            
        }
        
        
        
    }
        
        
        return 0 ;
        
        
    }
}