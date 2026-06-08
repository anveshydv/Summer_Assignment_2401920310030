// Approach: Math Index Mapping (One-Pass)
// Flatten 2D position to 1D index, then map back to new 2D position.
// pos = i*n + j → new row = pos/c, new col = pos%c
// Time Complexity: O(m*n) | Space Complexity: O(m*n)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "ReshapeMatrix"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        ReshapeMatrix sol = new ReshapeMatrix();
//        System.out.println(Arrays.deepToString(sol.matrixReshape(new int[][]{{1,2},{3,4}}, 1, 4))); // [[1,2,3,4]]
//    }
// 3. Add "import java.util.Arrays;" at top

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;

        if (m * n != r * c) return mat;

        int[][] result = new int[r][c];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int pos = i * n + j;
                result[pos / c][pos % c] = mat[i][j];
            }
        }

        return result;
    }
}