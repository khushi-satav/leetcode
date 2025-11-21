class Solution {
    public boolean isAnagram(String s, String t) {

        // 1. Length check
        if(s.length() != t.length()) return false;

        int[] char_counts = new int[26];

        // 2. Count s me +1, t me -1
        for(int i = 0; i < s.length(); i++) {
            char_counts[s.charAt(i) - 'a']++;
            char_counts[t.charAt(i) - 'a']--;
        }

        // 3. Agar sab zero hain = anagram
        for(int count : char_counts) {
            if(count != 0) return false;
        }

        return true;
    }
}
