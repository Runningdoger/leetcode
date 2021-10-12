package solution.leetcode.editor.cn;
//给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。 
//
//
// 
//
// 
// 
// 示例 1： 
//
// 
//输入：n = 2
//输出：[0,1,1]
//解释：
//0 --> 0
//1 --> 1
//2 --> 10
// 
//
// 示例 2： 
//
// 
//输入：n = 5
//输出：[0,1,1,2,1,2]
//解释：
//0 --> 0
//1 --> 1
//2 --> 10
//3 --> 11
//4 --> 100
//5 --> 101
//6 --> 110
//7 --> 111
//8 --> 1000
//
// 提示： 
//
// 
// 0 <= n <= 105 
// 
//
// 
//
// 进阶： 
//
// 
// 很容易就能实现时间复杂度为 O(n log n) 的解决方案，你可以在线性时间复杂度 O(n) 内用一趟扫描解决此问题吗？ 
// 你能不使用任何内置函数解决此问题吗？（如，C++ 中的 __builtin_popcount ） 
// 
// 
// 
// Related Topics 位运算 动态规划 
// 👍 812 👎 0


/**
 * @author seaweed
 * @date 2021-09-28 16:46:37
 */
public class CountingBits {
    public static void main(String[] args) {
        Solution solution = new CountingBits().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] countBits(int n) {
            int[] res = new int[n + 1];
            res[0] = 0;
            for (int i = 1; i <= n; i++) {
                if ((i & 1) == 1) {
                    res[i] = res[i - 1] + 1;
                } else {
                    res[i] = res[i / 2];
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

