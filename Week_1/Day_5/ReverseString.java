// Approach: Two Pointer (One-Pass)
// Swap characters from both ends moving inward until they meet.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "ReverseString"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        ReverseString sol = new ReverseString();
//        char[] s = {'h','e','l','l','o'};
//        sol.reverseString(s);
//        System.out.println(Arrays.toString(s)); // [o, l, l, e, h]
//    }
// 3. Add "import java.util.Arrays;" at top

class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}