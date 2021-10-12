package solution.leetcode.editor.cn;
//一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。 
//
// 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。 
//
// 问总共有多少条不同的路径？ 
//
// 
//
// 示例 1： 
//
// 
//输入：m = 3, n = 7
//输出：28 
//
// 示例 2： 
//
// 
//输入：m = 3, n = 2
//输出：3
//解释：
//从左上角开始，总共有 3 条路径可以到达右下角。
//1. 向右 -> 向下 -> 向下
//2. 向下 -> 向下 -> 向右
//3. 向下 -> 向右 -> 向下
// 
//
// 示例 3： 
//
// 
//输入：m = 7, n = 3
//输出：28
// 
//
// 示例 4： 
//
// 
//输入：m = 3, n = 3
//输出：6 
//
// 
//
// 提示： 
//
// 
// 1 <= m, n <= 100 
// 题目数据保证答案小于等于 2 * 109 
// 
// Related Topics 数学 动态规划 组合数学 
// 👍 1126 👎 0


/**
 * @author seaweed
 * @date 2021-09-30 16:54:46
 * @QuestionId 62    题目编号
 */
public class UniquePaths {
    public static void main(String[] args) {
        Solution solution = new UniquePaths().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int uniquePaths(int m, int n) {
            int[][] d = new int[m + 5][n + 5];
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 && j == 1) {
                        d[1][1] = 1;
                    } else {
                        if (i == 1) {
                            d[i][j] = d[i][j - 1];
                        } else {
                            if (j == 1) {
                                d[i][j] = d[i - 1][j];
                            } else {
                                d[i][j] = d[i - 1][j] + d[i][j - 1];
                            }
                        }
                    }
                }
            }
            return d[m][n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

