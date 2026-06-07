// Approach: Greedy (One-Pass)
// Track the minimum price seen so far as the best buy point.
// At each day, if price is lower than min → update min.
// Otherwise check if selling today gives better profit than before.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "BuyAndSell1"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        BuyAndSell1 sol = new BuyAndSell1();
//        System.out.println(sol.maxProfit(new int[]{7,1,5,3,6,4})); // 5
//        System.out.println(sol.maxProfit(new int[]{7,6,4,3,1}));   // 0
//    }
// 3. No extra imports needed!

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}