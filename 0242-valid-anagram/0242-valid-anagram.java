
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Anagrams must have the same length
        }
        
        Map<Character, Integer> letterCount = new HashMap<>();
        
       
        for (char a : s.toCharArray()) {
            letterCount.put(a, letterCount.getOrDefault(a, 0) + 1);
        }
        
        for(char b : t.toCharArray()){
            if(!letterCount.containsKey(b)){
                return false;
            }
            letterCount.put(b, letterCount.get(b)-1);
            
            if(letterCount.get(b)==0){
                letterCount.remove(b);
            }
            
        }
        
       return letterCount.isEmpty();
    }
}
