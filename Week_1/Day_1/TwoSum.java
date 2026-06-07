// Approach: HashMap (One-Pass)
// For each number, we calculate what we "need" (target - current number).
// If that number was seen before, we found our pair → return both indices.
// If not, store current number with its index and move on.
// Time Complexity: O(n) | Space Complexity: O(n)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "TwoSum"
// 2. Change method name from "twoSum" to "findIndices" (or anything)
// 3. Add main method to test:
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        System.out.println(Arrays.toString(sol.twoSum(new int[]{2,7,11,15}, 9)));
//    }
// 4. Add "import java.util.Arrays;" at top for Arrays.toString()

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                return new int[]{seen.get(need), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }
}