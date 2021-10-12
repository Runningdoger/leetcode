package solution.leetcode.editor.cn;
//三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模100
//0000007。 
//
// 示例1: 
//
// 
// 输入：n = 3 
// 输出：4
// 说明: 有四种走法
// 
//
// 示例2: 
//
// 
// 输入：n = 5
// 输出：13
// 
//
// 提示: 
//
// 
// n范围在[1, 1000000]之间 
// 
// Related Topics 记忆化搜索 数学 动态规划 
// 👍 66 👎 0


/**
 * @author seaweed
 * @date 2021-09-29 16:50:43
 * @QuestionId 面试题 08.01	题目编号
 */
public class ThreeStepsProblemLcci {
    public static void main(String[] args) {
        Solution solution = new ThreeStepsProblemLcci().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int waysToStep(int n) {
            int[] d = new int[n + 5];
            d[0] = 1;
            d[1] = 1;
            d[2] = 2;
            for (int i = 3; i <= n; i++) {
                d[i] = ((d[i - 3] + d[i - 2]) % 1000000007 + d[i - 1]) % 1000000007;
            }
            return d[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

