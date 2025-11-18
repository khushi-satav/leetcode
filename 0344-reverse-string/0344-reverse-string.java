class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] temp = new char[n];

        // fill temp from end of s
        for(int i = 0; i < n; i++) {
            temp[i] = s[n - 1 - i];
        }

        // copy temp back to s
        for(int i = 0; i < n; i++) {
            s[i] = temp[i];
        }
    }
}
