class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        char[] patternChars = pattern.toCharArray();
        
        if (words.length != patternChars.length) {
            return false; // If pattern length doesn't match the number of words, return false
        }
        
        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = patternChars[i];
            String word = words[i];
            if (map.containsKey(patternChar)) {
                if (!map.get(patternChar).equals(word)) {
                    return false; // If pattern character is mapped to a different word, return false
                }
            } else {
                if (map.containsValue(word)) {
                    return false; // If word is mapped to a different pattern character, return false
                }
                map.put(patternChar, word);
            }
        }
        
        // Construct a string using the mapped words
        StringBuilder sb = new StringBuilder();
        for (char a : patternChars) {
            sb.append(map.get(a)).append(" ");
        }
        String mappedString = sb.toString().trim(); // Trim to remove the trailing space
        
        // Compare the constructed string with the original string
        return s.equals(mappedString);
    }
}
