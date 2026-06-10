
// Approach: Linear Search with early exit
// Slide over haystack, at each position check if needle matches.
// Stop as soon as remaining length is less than needle length.
// Time Complexity: O(n*m) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "FindIndexFirstOccurrence"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        FindIndexFirstOccurrence sol = new FindIndexFirstOccurrence();
//        System.out.println(sol.strStr("sadbutsad", "sad")); // 0
//        System.out.println(sol.strStr("leetcode", "leeto")); // -1
//    }
// 3. No extra imports needed!

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) return i;
        }

        return -1;
    }
}