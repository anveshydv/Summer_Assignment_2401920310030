// Approach: Expand Around Center
// Every palindrome expands from a center — either 1 char (odd) or 2 chars (even).
// Try expanding from every center, track the longest found.
// Time Complexity: O(n²) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "LongestPalindromicSubstring"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        LongestPalindromicSubstring sol = new LongestPalindromicSubstring();
//        System.out.println(sol.longestPalindrome("babad")); // bab
//        System.out.println(sol.longestPalindrome("cbbd"));  // bb
//    }
// 3. No extra imports needed!

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;

        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {
            // odd length
            int l = i, r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) { l--; r++; }
            if (r - l - 1 > maxLen) { maxLen = r - l - 1; start = l + 1; }

            // even length
            l = i; r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) { l--; r++; }
            if (r - l - 1 > maxLen) { maxLen = r - l - 1; start = l + 1; }
        }

        return s.substring(start, start + maxLen);
    }
}