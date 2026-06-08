// Approach: Frequency Count Array (One-Pass)
// Count chars of s (increment) and t (decrement) in same int[26] array.
// If all zeros at end → anagram.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "ValidAnagram"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        ValidAnagram sol = new ValidAnagram();
//        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
//        System.out.println(sol.isAnagram("rat", "car"));         // false
//    }
// 3. No extra imports needed!

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) if (c != 0) return false;

        return true;
    }
}