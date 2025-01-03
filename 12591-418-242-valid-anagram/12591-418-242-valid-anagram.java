class Solution {
    public boolean isAnagram(String s, String t) {
         // s = "anagram", t = "nagaram"
        
        
        if(s.length()!=t.length()){
            return false;
        }
        
        
        Map<Character,Integer> map = new HashMap<>();
        
        
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
            
        }
        
        for(char b:t.toCharArray()){
            
            if(!map.containsKey(b)){
                return false;
            }
            

            map.put(b,map.get(b)-1);
            
            if(map.get(b)==0){
                map.remove(b);
            }
            
            
            
        }
        
        return map.isEmpty();
    
        
        
    }
}