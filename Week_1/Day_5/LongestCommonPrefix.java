// Approach: Horizontal Scanning
// Take first string as prefix, shrink it until every string starts with it.
// Time Complexity: O(n*m) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "LongestCommonPrefix"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        LongestCommonPrefix sol = new LongestCommonPrefix();
//        System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"})); // fl
//        System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"}));    // ""
//    }
// 3. No extra imports needed!

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}