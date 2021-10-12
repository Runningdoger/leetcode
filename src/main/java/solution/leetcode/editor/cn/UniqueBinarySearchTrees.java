package solution.leetcode.editor.cn;
//给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：5
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 19 
// 
// Related Topics 树 二叉搜索树 数学 动态规划 二叉树 
// 👍 1356 👎 0


/**
 * @author seaweed
 * @date 2021-10-09 09:51:07
 * @QuestionId 96    题目编号
 *
 * d[i] 代表i个数字能排列多少个组合
 * 以 i 为顶点的树，左子树可以为 0~i-1个数字，右子树可以为0~n-i个数字，所以d[i]等于这些乘积之和
 */
public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        Solution solution = new UniqueBinarySearchTrees().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numTrees(int n) {
            int[] d = new int[n+5];
            d[0]=1;
            d[1]=1;
            for(int i=2;i<=n;i++){
                for(int j=1;j<=i;j++){
                    d[i]+=d[j-1]*d[i-j];
                }
            }
            return d[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

