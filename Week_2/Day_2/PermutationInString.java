// Approach: Sliding Window + Frequency Count
// A permutation has same char frequencies as original.
// Maintain a fixed window of size s1.length() over s2.
// Track how many chars have matching frequency using 'matches' counter.
// Time Complexity: O(n) | Space Complexity: O(1) — fixed 26 array
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "PermutationInString"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        PermutationInString sol = new PermutationInString();
//        System.out.println(sol.checkInclusion("ab", "eidbaooo")); // true
//        System.out.println(sol.checkInclusion("ab", "eidboaoo")); // false
//    }
// 3. No extra imports needed!

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        int matches = 0;

        // build first window
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // count initial matches
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]) matches++;
        }

        // slide window
        for (int i = s1.length(); i < s2.length(); i++) {
            if (matches == 26) return true;

            int right = s2.charAt(i) - 'a';
            int left  = s2.charAt(i - s1.length()) - 'a';

            // add right char
            s2Count[right]++;
            if (s2Count[right] == s1Count[right])      matches++;
            else if (s2Count[right] == s1Count[right] + 1) matches--;

            // remove left char
            s2Count[left]--;
            if (s2Count[left] == s1Count[left])        matches++;
            else if (s2Count[left] == s1Count[left] - 1)   matches--;
        }

        return matches == 26;
    }
}