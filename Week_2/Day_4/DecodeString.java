// Approach: Stack
// Push current string and repeat count onto stack when '[' found.
// On ']', pop and repeat current string k times, append to previous.
// Handles nested brackets naturally via stack.
// Time Complexity: O(n*k) | Space Complexity: O(n)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "DecodeString"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        DecodeString sol = new DecodeString();
//        System.out.println(sol.decodeString("3[a]2[bc]"));    // aaabcbc
//        System.out.println(sol.decodeString("3[a2[c]]"));     // accaccacc
//        System.out.println(sol.decodeString("2[abc]3[cd]ef")); // abcabccdcdcdef
//    }
// 3. Add "import java.util.Stack;" at top


class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> strings = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                counts.push(k);
                strings.push(current);
                current = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                int repeat = counts.pop();
                StringBuilder prev = strings.pop();
                for (int i = 0; i < repeat; i++) prev.append(current);
                current = prev;
            } else {
                current.append(c);
            }
        }

        return current.toString();
    }
}