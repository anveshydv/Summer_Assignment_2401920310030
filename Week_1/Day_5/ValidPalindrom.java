// Approach: Two Pointer (One-Pass)
// Skip non-alphanumeric chars from both ends, compare lowercase chars.
// No extra string/array needed — check in-place.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "ValidPalindrome"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        ValidPalindrome sol = new ValidPalindrome();
//        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // true
//        System.out.println(sol.isPalindrome("race a car"));                      // false
//    }
// 3. No extra imports needed!

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))  left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;

            left++;
            right--;
        }

        return true;
    }
}