// Approach: Single Loop (One-Pass)
// Primary diagonal: mat[i][i]
// Secondary diagonal: mat[i][n-1-i]
// If odd sized matrix, center element gets counted twice — subtract it once.
// Time Complexity: O(n) | Space Complexity: O(1)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "MatrixDiagonalSum"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        MatrixDiagonalSum sol = new MatrixDiagonalSum();
//        System.out.println(sol.diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}})); // 25
//    }
// 3. No extra imports needed!

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        if (n % 2 != 0) sum -= mat[n / 2][n / 2];

        return sum;
    }
}