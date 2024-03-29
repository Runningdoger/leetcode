package solution.leetcode.editor.cn;
//给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。 
//
// 说明：每次只能向下或者向右移动一步。 
//
// 
//
// 示例 1： 
//
// 
//输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
//输出：7
//解释：因为路径 1→3→1→1→1 的总和最小。
// 
//
// 示例 2： 
//
// 
//输入：grid = [[1,2,3],[4,5,6]]
//输出：12
// 
//
// 
//
// 提示： 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 200 
// 0 <= grid[i][j] <= 100 
// 
// Related Topics 数组 动态规划 矩阵 
// 👍 1022 👎 0


/**
 * @author seaweed
 * @date 2021-10-08 10:28:45
 * @QuestionId 64    题目编号
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        Solution solution = new MinimumPathSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[][] d = new int[m + 5][n + 5];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1) {
                        d[i][j] = d[i][j - 1] + grid[i-1][j-1];
                    } else {
                        if (j == 1) {
                            d[i][j] = d[i - 1][j] + grid[i-1][j-1];
                        } else {
                            d[i][j]=Math.min(d[i-1][j],d[i][j-1])+grid[i-1][j-1];
                        }
                    }
                }
            }
            return d[m][n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

