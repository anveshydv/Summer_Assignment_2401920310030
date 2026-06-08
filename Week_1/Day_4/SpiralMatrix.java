// Approach: Boundary Shrinking
// Maintain 4 boundaries (top, bottom, left, right).
// Traverse right → down → left → up, shrink boundary after each pass.
// Time Complexity: O(m*n) | Space Complexity: O(1) excluding output
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "SpiralMatrix"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        SpiralMatrix sol = new SpiralMatrix();
//        System.out.println(sol.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}})); // [1,2,3,6,9,8,7,4,5]
//    }
// 3. Add "import java.util.List; import java.util.ArrayList;" at top

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)  result.add(matrix[top][i]);
            top++;

            for (int i = top; i <= bottom; i++)  result.add(matrix[i][right]);
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) result.add(matrix[bottom][i]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) result.add(matrix[i][left]);
                left++;
            }
        }

        return result;
    }
}