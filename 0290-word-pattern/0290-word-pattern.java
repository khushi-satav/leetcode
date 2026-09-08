

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        // Number of characters and words must be same
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            // ch already mapped to another word
            if (map1.containsKey(ch) && !map1.get(ch).equals(word)) {
                return false;
            }

            // word already mapped to another character
            if (map2.containsKey(word) && map2.get(word) != ch) {
                return false;
            }

            // Create mappings
            map1.put(ch, word);
            map2.put(word, ch);
        }

        return true;
    }
}

