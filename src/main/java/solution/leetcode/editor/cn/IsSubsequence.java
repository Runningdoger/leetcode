package solution.leetcode.editor.cn;
//给定字符串 s 和 t ，判断 s 是否为 t 的子序列。 
//
// 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"ae
//c"不是）。 
//
// 进阶： 
//
// 如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代
//码？ 
//
// 致谢： 
//
// 特别感谢 @pbrother 添加此问题并且创建所有测试用例。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "abc", t = "ahbgdc"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "axc", t = "ahbgdc"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 100 
// 0 <= t.length <= 10^4 
// 两个字符串都只由小写字符组成。 
// 
// Related Topics 双指针 字符串 动态规划 
// 👍 520 👎 0


/**
 * @author seaweed
 * @date 2021-09-28 17:18:01
 * @QuestionId 392    题目编号
 */
public class IsSubsequence {
    public static void main(String[] args) {
        Solution solution = new IsSubsequence().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int p = 0;
            if ("".equals(s) || s == null) return true;
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == s.charAt(p)) {
                    p++;
                }
                if (p == s.length()) {
                    return true;
                }
            }
            return false;
        }

        public boolean dp(String s, String t) {
            if ("".equals(s) || s == null) return true;
            int[][] dp = new int[t.length() + 1][26];
            for (int i = t.length(); i >= 0; i--) {
                for (int j = 0; j < 26; j++)
                    if (i == t.length()) {
                        dp[i][j] = t.length();
                    } else {
                        if (t.charAt(i) - 'a' == j) {
                            dp[i][j] = i;
                        } else {
                            dp[i][j] = dp[i + 1][j];
                        }
                    }
            }
            int pos = 0;
            for (int i = 0; i < s.length(); i++) {
                int j = s.charAt(i) - 'a';
                if (dp[pos][j] == t.length()) {
                    return false;
                }
                pos = dp[pos][j] + 1;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

