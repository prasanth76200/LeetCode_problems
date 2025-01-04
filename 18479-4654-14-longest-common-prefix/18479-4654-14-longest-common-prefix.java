class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Handle edge case of empty input
        }

        StringBuilder sb = new StringBuilder();

        // Iterate through each character of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char lett = strs[0].charAt(i); // Use the first string's characters for comparison

            // Check this character across all other strings
            for (int j = 1; j < strs.length; j++) {
                // Stop if the string is shorter or the character doesn't match
                if (i >= strs[j].length() || strs[j].charAt(i) != lett) {
                    return sb.toString();
                }
            }

            // Append the character if it matches in all strings
            sb.append(lett);
        }

        return sb.toString();
    }
}
