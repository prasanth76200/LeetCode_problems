import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x =0;
        int y=0;
        visited.add(x +"," +y);
        
        for(char a : path.toCharArray()){
            switch(a){
                case 'N':
                    y++;
                    break;
                    
                case 'S':
                    y--;
                    break;
                    
                case 'E':
                    x++;
                    break;
                    
                case 'W':
                    x--;
                    break;
                    
            }
            String cureentAns = x +","+y; 
            
            if(!visited.add(cureentAns)){
                return true;
            }
            
        }
        
    return false;
    }
}
