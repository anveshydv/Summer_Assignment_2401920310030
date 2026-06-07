// Approach: Sliding Window (One-Pass)
// Build first window of size k, then slide it forward adding next, removing first.
// Track maximum sum, divide by k at the end for average.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "MaxAvgSubarray"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        MaxAvgSubarray sol = new MaxAvgSubarray();
//        System.out.println(sol.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4)); // 12.75
//        System.out.println(sol.findMaxAverage(new int[]{5}, 1));               // 5.0
//    }
// 3. No extra imports needed!

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) sum += nums[i];

        int best = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > best) best = sum;
        }

        return (double) best / k;
    }
}