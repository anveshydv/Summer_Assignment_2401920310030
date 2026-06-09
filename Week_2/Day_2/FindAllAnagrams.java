// Approach: Sliding Window + Single Frequency Array
// Subtract p chars and add s window chars in one array — 0 means balanced.
// Slide window tracking matches, collect start index whenever matches==26.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "FindAllAnagrams"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        FindAllAnagrams sol = new FindAllAnagrams();
//        System.out.println(sol.findAnagrams("cbaebabacd", "abc")); // [0, 6]
//        System.out.println(sol.findAnagrams("abab", "ab"));        // [0, 1, 2]
//    }
// 3. Add "import java.util.List; import java.util.ArrayList;" at top

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) return result;

        int[] count = new int[26];
        int pLen = p.length();
        int matches = 0;

        for (int i = 0; i < pLen; i++) {
            count[p.charAt(i) - 'a']--;
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) if (count[i] == 0) matches++;

        for (int i = pLen; i < s.length(); i++) {
            if (matches == 26) result.add(i - pLen);

            int right = s.charAt(i) - 'a';
            int left  = s.charAt(i - pLen) - 'a';

            count[right]++;
            if (count[right] == 0)      matches++;
            else if (count[right] == 1) matches--;

            count[left]--;
            if (count[left] == 0)       matches++;
            else if (count[left] == -1) matches--;
        }

        if (matches == 26) result.add(s.length() - pLen);

        return result;
    }
}