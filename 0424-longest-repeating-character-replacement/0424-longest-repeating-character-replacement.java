import java.util.HashMap;
import java.util.Map;

class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxCount = Math.max(maxCount, map.get(c));
            
            // Check if the current window size - maxCount > k, 
            // if so, move left pointer
            if (right - left + 1 - maxCount > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            
            // Update maxLength in each iteration
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
