// Approach: Two Pointer (One-Pass)
// Start from both ends, water = min(left, right) * width.
// Move the shorter side inward — only way to possibly find more water.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "ContainerWithMostWater"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        ContainerWithMostWater sol = new ContainerWithMostWater();
//        System.out.println(sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
//        System.out.println(sol.maxArea(new int[]{1,1}));                // 1
//    }
// 3. No extra imports needed!

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;

        while (left < right) {
            int water = Math.min(height[left], height[right]) * (right - left);
            if (water > max) max = water;

            if (height[left] < height[right]) left++;
            else right--;
        }

        return max;
    }
}
