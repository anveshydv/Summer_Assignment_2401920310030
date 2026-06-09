// Approach: Sliding Window + int[128] array
// Use two pointers (left, right) to maintain a window of unique chars.
// When duplicate found, shrink window from left until duplicate is gone.
// int[128] instead of HashMap → covers all ASCII, much faster.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "LongestSubstring"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        LongestSubstring sol = new LongestSubstring();
//        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // 3
//        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));    // 1
//        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));   // 3
//    }
// 3. No extra imports needed!

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[128];
        int left = 0, best = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {
            count[s.charAt(right)]++;

            while (count[s.charAt(right)] > 1) {
                count[s.charAt(left)]--;
                left++;
            }

            if (right - left + 1 > best) best = right - left + 1;
        }

        return best;
    }
}