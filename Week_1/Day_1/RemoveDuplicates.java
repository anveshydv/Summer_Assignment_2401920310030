// Approach: Two Pointer (One-Pass)
// 'place' acts as a writer — only moves forward when a new unique element is found.
// Compare current element with previous, if different write it at 'place' and advance.
// First element is always unique so place starts at 1.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "RemoveDuplicates"
// 2. Change method name from "removeDuplicates" to anything (or keep same)
// 3. Add main method to test:
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int k = sol.removeDuplicates(nums);
//        System.out.println(k);
//        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, k)));
//    }
// 4. Add "import java.util.Arrays;" at top for Arrays.toString()

class Solution {
    public int removeDuplicates(int[] nums) {
        int place = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[place] = nums[i];
                place++;
            }
        }
        return place;
    }
}