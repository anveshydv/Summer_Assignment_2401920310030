// Approach: HashSet (One-Pass)
// Add each element to a set — if it already exists, duplicate found.
// Time Complexity: O(n) | Space Complexity: O(n)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "ContainsDuplicate"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        ContainsDuplicate sol = new ContainsDuplicate();
//        System.out.println(sol.containsDuplicate(new int[]{1,2,3,1})); // true
//        System.out.println(sol.containsDuplicate(new int[]{1,2,3,4})); // false
//    }
// 3. Add "import java.util.HashSet;" at top

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if (!seen.add(n)) return true;
        }
        return false;
    }
}