// Approach: Backtracking
// Add '(' only if open count < n.
// Add ')' only if close count < open count.
// When string length == 2*n → valid combination found, add to result.
// Time Complexity: O(4^n/√n) | Space Complexity: O(n)
//
// ⚠️ To run locally on any IDE:
// 1. Change class name from "Solution" to "GenerateParentheses"
// 2. Add main method to test:
//    public static void main(String[] args) {
//        GenerateParentheses sol = new GenerateParentheses();
//        System.out.println(sol.generateParenthesis(3)); // [((())) , (()()) , (())() , ()(()) , ()()()]
//        System.out.println(sol.generateParenthesis(1)); // [()]
//    }
// 3. Add "import java.util.List; import java.util.ArrayList;" at top

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current.toString());
            return;
        }

        if (open < n) {
            current.append('(');
            backtrack(result, current, open + 1, close, n);
            current.deleteCharAt(current.length() - 1);
        }

        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, n);
            current.deleteCharAt(current.length() - 1);
        }
    }
}