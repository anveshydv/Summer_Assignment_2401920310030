// Approach: Frequency Count Array
// Count all chars in magazine, then subtract for each char in ransomNote.
// If any count goes negative → that letter is not enough → return false.
// Time Complexity: O(n) | Space Complexity: O(1) — fixed 26 size array
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "RansomNote"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        RansomNote sol = new RansomNote();
//        System.out.println(sol.canConstruct("a", "b"));    // false
//        System.out.println(sol.canConstruct("aa", "ab"));  // false
//        System.out.println(sol.canConstruct("aa", "aab")); // true
//    }
// 3. No extra imports needed!

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (char c : magazine.toCharArray())   count[c - 'a']++;
        for (char c : ransomNote.toCharArray()) count[c - 'a']--;

        for (int c : count) if (c < 0) return false;

        return true;
    }
}