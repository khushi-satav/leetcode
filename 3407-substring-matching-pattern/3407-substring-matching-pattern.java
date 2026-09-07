class Solution {
    public boolean hasMatch(String s, String p) {

        int star = p.indexOf('*');

        String left = p.substring(0, star);
        String right = p.substring(star + 1);

        for (int i = 0; i <= s.length() - left.length(); i++) {

            if (!s.substring(i, i + left.length()).equals(left))
                continue;

            for (int j = i + left.length(); j <= s.length() - right.length(); j++) {

                if (s.substring(j, j + right.length()).equals(right)) {
                    return true;
                }
            }
        }

        return false;
    }
}