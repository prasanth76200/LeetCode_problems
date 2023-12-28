
class Solution {
    public boolean checkIfPangram(String sentence) {
        // Use Set<Character> instead of Set<String> for individual characters
        Set<Character> charSet = new HashSet<>();

        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            // Use charAt(i) instead of CharAt(i)
            char currentChar = sentence.charAt(i);
            charSet.add(currentChar);
        }

        // Check if the size of the set is 26 (all letters of the alphabet)
        if (charSet.size() == 26) {
            return true;
        } else {
            return false;
        }
    }
}