// Approach: Two Pointer in-place char array
// Convert to char array, find each word boundary, reverse chars in place.
// No extra strings created — directly manipulate the array.
// Time Complexity: O(n) | Space Complexity: O(n)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "ReverseWordsIII"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        ReverseWordsIII sol = new ReverseWordsIII();
//        System.out.println(sol.reverseWords("Let's take LeetCode contest")); // s'teL ekat edoCteeL tsetnoc
//        System.out.println(sol.reverseWords("Mr Ding"));                     // rM gniD
//    }
// 3. No extra imports needed!

class Solution {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int i = 0;

        for (int j = 0; j <= c.length; j++) {
            if (j == c.length || c[j] == ' ') {
                reverse(c, i, j - 1);
                i = j + 1;
            }
        }

        return new String(c);
    }

    private void reverse(char[] c, int left, int right) {
        while (left < right) {
            char temp = c[left];
            c[left++] = c[right];
            c[right--] = temp;
        }
    }
}