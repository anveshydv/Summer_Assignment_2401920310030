// Approach: Two Pointer In-Place
// Use write pointer to overwrite chars array directly.
// Count consecutive chars, write char then count digits if count > 1.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "StringCompression"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        StringCompression sol = new StringCompression();
//        System.out.println(sol.compress(new char[]{'a','a','b','b','c','c','c'})); // 6
//        System.out.println(sol.compress(new char[]{'a'}));                         // 1
//        System.out.println(sol.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'})); // 4
//    }
// 3. No extra imports needed!

class Solution {
    public int compress(char[] chars) {
        int write = 0, i = 0;
        int n = chars.length;

        while (i < n) {
            char cur = chars[i];
            int count = 0;

            while (i < n && chars[i] == cur) { i++; count++; }

            chars[write++] = cur;

            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
