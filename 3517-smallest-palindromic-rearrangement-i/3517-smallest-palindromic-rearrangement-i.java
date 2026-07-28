class Solution {
    public String smallestPalindrome(String s) {
        
        int[] freq = new int[26];

        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = ' ';

        // Create left half in sorted order
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                middle = (char)(i + 'a');
            }

            // Add half frequency characters
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char)(i + 'a'));
            }
        }

        // Right half is reverse of left
        String right = left.reverse().toString();

        // Restore left because reverse changed it
        left.reverse();

        // Combine left + middle + right
        if (middle == ' ') {
            return left.toString() + right;
        } else {
            return left.toString() + middle + right;
        }
    }
}