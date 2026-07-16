import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> ss = new Stack<>();
        Stack<Character> tt = new Stack<>();

        
        for (char i : s.toCharArray()) {
            if (i == '#') {
                if (!ss.empty()) {
                    ss.pop();
                }
            } else {
                ss.push(i);
            }
        }

        
        for (char i : t.toCharArray()) {
            if (i == '#') {
                if (!tt.empty()) {
                    tt.pop();
                }
            } else {
                tt.push(i);
            }
        }

        return ss.equals(tt);
    }
}