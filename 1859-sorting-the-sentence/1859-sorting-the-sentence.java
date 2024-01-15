class Solution {
    public String sortSentence(String s) {
        Map<Integer,String> wordMap = new HashMap<>();
        
        for(String word:s.split(" ")){
            int lastIndex = word.length()-1;
            
            int Index = word.charAt(lastIndex) -'0';
            String str = word.substring(0,lastIndex);
            wordMap.put(Index,str);
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer,String> acutalWord : wordMap.entrySet()){
            sb.append(acutalWord.getValue());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}