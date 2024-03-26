import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map_1 = new HashMap<>();
        Map<Character, Character> map_2 = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if (!map_1.containsKey(sChar)){
               map_1.put(sChar, tChar); 
            }else{
               if( map_1.get(sChar)!=tChar){
                   return false;
               }
            }
                
            if (!map_2.containsKey(tChar)){
                map_2.put(tChar, sChar);
                }
            else{
               if( map_2.get(tChar)!=sChar){
                   return false;
               }
            }
        }
           return true;
        }
        
        
    
}
