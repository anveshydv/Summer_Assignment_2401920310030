// Approach: Kadane's Algorithm (One-Pass)
// Keep adding elements as long as sum is positive, reset when negative.
// Start with nums[0] not 0 — handles all-negative arrays correctly.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "MaxSubarray"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        MaxArray sol = new MaxArray();
//        System.out.println(sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
//    }
// 3. No extra imports needed!

class Solution {
    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int best = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (current < 0) current = nums[i];
            else current += nums[i];
            if (current > best) best = current;
        }

        return best;
    }
}