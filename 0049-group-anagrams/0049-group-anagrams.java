class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map =new HashMap<>();
        
        for(String s:strs){
        int[] count = new int[26];
           
            for(char chars : s.toCharArray()){
                count[chars -'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            
            for(int i=0 ;i<26;i++){
               sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
            
        }
        
        return new ArrayList<>(map.values());
    }
}