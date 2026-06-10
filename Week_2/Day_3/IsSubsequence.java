// Approach: Two Pointer (One-Pass)
// Convert both strings to char arrays for faster access.
// Walk through t, match chars of s in order, return true immediately on full match.
// Time Complexity: O(n) | Space Complexity: O(n)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "IsSubsequence"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        IsSubsequence sol = new IsSubsequence();
//        System.out.println(sol.isSubsequence("abc", "ahbgdc")); // true
//        System.out.println(sol.isSubsequence("axc", "ahbgdc")); // false
//    }
// 3. No extra imports needed!

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (s.length() > t.length()) return false;

        int i = 0;
        int n = s.length();
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        for (int j = 0; j < tc.length; j++) {
            if (sc[i] == tc[j] && ++i == n) return true;
        }

        return false;
    }
}