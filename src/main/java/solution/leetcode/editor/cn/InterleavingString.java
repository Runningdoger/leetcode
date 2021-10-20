package solution.leetcode.editor.cn;
//给定三个字符串 s1、s2、s3，请你帮忙验证 s3 是否是由 s1 和 s2 交错 组成的。 
//
// 两个字符串 s 和 t 交错 的定义与过程如下，其中每个字符串都会被分割成若干 非空 子字符串： 
//
// 
// s = s1 + s2 + ... + sn 
// t = t1 + t2 + ... + tm 
// |n - m| <= 1 
// 交错 是 s1 + t1 + s2 + t2 + s3 + t3 + ... 或者 t1 + s1 + t2 + s2 + t3 + s3 + ... 
// 
//
// 提示：a + b 意味着字符串 a 和 b 连接。 
//
// 
//
// 示例 1： 
//
// 
//输入：s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：s1 = "", s2 = "", s3 = ""
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s1.length, s2.length <= 100 
// 0 <= s3.length <= 200 
// s1、s2、和 s3 都由小写英文字母组成 
// 
// Related Topics 字符串 动态规划 
// 👍 560 👎 0


/**
 * @author seaweed
 * @date 2021-10-12 13:41:46
 * @QuestionId 97    题目编号
 */
public class InterleavingString {
    public static void main(String[] args) {
        Solution solution = new InterleavingString().new Solution();
        solution.isInterleave("a","b","a");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isInterleave(String s1, String s2, String s3) {
            //是否可以拼接成s3
            if(s1.length()+s2.length()!=s3.length()){
                return false;
            }
            //dp数组 dp[i][j]代表s1前i个字符和s2前j个字符是否可以拼接为s3的前i+j个字符
            boolean[][] d = new boolean[s1.length() + 5][s2.length() + 5];
            for (int i = 0; i <= s1.length(); i++) {
                for (int j = 0; j <= s2.length(); j++) {
                    //边界条件，dp[0][0]=true;
                    if (i == 0 && j == 0) {
                        d[0][0]=true;
                        continue;
                    } else {
                        //s3的下标
                        int p = i + j -1;
                        //dp[i][j]=true有两种情况，一种是dp[i-1][j]为true并且s1[i]==s3[p]
                        if(i!=0&&s3.charAt(p)==s1.charAt(i-1)&&d[i-1][j]){
                            d[i][j]=true;
                        }
                        //另一种是dp[i][j-1]为true并且s2[j]==s3[p]
                        if(j!=0&&s3.charAt(p)==s2.charAt(j-1)&&d[i][j-1]){
                            d[i][j]=true;
                        }
                    }
                }
            }
            return d[s1.length()][s2.length()];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

