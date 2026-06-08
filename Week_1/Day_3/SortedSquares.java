// Approach: Two Pointer (One-Pass)
// Largest squares always come from either leftmost or rightmost element.
// Compare absolute values from both ends, fill result array from back to front.
// Time Complexity: O(n) | Space Complexity: O(n)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "SortedSquares"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        SortedSquares sol = new SortedSquares();
//        System.out.println(Arrays.toString(sol.sortedSquares(new int[]{-4,-1,0,3,10}))); // [0,1,9,16,100]
//    }
// 3. Add "import java.util.Arrays;" at top

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] result = new int[nums.length];
        int pos = nums.length - 1;

        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];

            if (l > r) { result[pos--] = l; left++; }
            else        { result[pos--] = r; right--; }
        }

        return result;
    }
}