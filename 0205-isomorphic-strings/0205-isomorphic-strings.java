class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> maps= new HashMap<>();
        Map<Character,Character> mapt= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            
         if(!maps.containsKey(a)){
              maps.put(a,b);
             }else{
            if(maps.get(a)!=b){
                return false;
            } 
         }
            
             if(!mapt.containsKey(b)){
             mapt.put(b,a);
         } else{
             if(mapt.get(b)!=a) {
                 return false;
             }
         }
           
            
        }
        return true;
    }
}