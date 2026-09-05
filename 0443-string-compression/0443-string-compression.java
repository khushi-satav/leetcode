class Solution {
    public int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {

            char ch = chars[read];
            int count = 0;

            // Count consecutive same characters
            while (read < chars.length && chars[read] == ch) {
                read++;
                count++;
            }

            // Write character
            chars[write++] = ch;

            // Write count if > 1
            if (count > 1) {
                String s = String.valueOf(count);

                for (char c : s.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}