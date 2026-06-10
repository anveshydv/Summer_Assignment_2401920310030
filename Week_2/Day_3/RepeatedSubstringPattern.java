
// Approach: Pattern Length Iteration
// Try every possible pattern length from 1 to n/2.
// Skip if n not divisible by length — can't tile evenly.
// Check if whole string is just that pattern repeating using char array.
// Time Complexity: O(n√n) | Space Complexity: O(n)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "RepeatedSubstringPattern"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        RepeatedSubstringPattern sol = new RepeatedSubstringPattern();
//        System.out.println(sol.repeatedSubstringPattern("abab"));         // true
//        System.out.println(sol.repeatedSubstringPattern("aba"));          // false
//        System.out.println(sol.repeatedSubstringPattern("abcabcabcabc")); // true
//    }
// 3. No extra imports needed!

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        char[] c = s.toCharArray();

        for (int len = 1; len <= n / 2; len++) {
            if (n % len != 0) continue;

            boolean match = true;
            for (int i = len; i < n; i++) {
                if (c[i] != c[i % len]) { match = false; break; }
            }
            if (match) return true;
        }

        return false;
    }
}