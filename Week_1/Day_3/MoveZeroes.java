// Approach: Two Pointer (One-Pass)
// 'pos' tracks where next non-zero should go.
// When non-zero found, place it at pos and advance.
// Remaining spots at end are filled with 0.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "MoveZeroes"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        MoveZeroes sol = new MoveZeroes();
//        int[] nums = {0,1,0,3,12};
//        sol.moveZeroes(nums);
//        System.out.println(Arrays.toString(nums)); // [1,3,12,0,0]
//    }
// 3. Add "import java.util.Arrays;" at top

class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[pos++] = nums[i];
        }

        while (pos < nums.length) nums[pos++] = 0;
    }
}
