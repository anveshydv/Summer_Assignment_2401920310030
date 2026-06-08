// Approach: Frequency Count Array (Two-Pass)
// First pass → count frequency of every character.
// Second pass → return index of first char with frequency 1.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "FirstUniqueChar"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        FirstUniqueChar sol = new FirstUniqueChar();
//        System.out.println(sol.firstUniqChar("leetcode"));     // 0
//        System.out.println(sol.firstUniqChar("loveleetcode")); // 2
//        System.out.println(sol.firstUniqChar("aabb"));         // -1
//    }
// 3. No extra imports needed!

class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) count[s.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++) if (count[s.charAt(i) - 'a'] == 1) return i;

        return -1;
    }
}