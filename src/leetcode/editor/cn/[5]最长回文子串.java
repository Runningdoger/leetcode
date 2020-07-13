package leetcode.editor.cn;
import sun.security.util.Length;
import util.*;
class question_5{
//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。 
//
// 示例 1： 
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
// 
//
// 示例 2： 
//
// 输入: "cbbd"
//输出: "bb"
// 
// Related Topics 字符串 动态规划


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp=new boolean[s.length()][s.length()];
        int len=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j>=0;j--){
                if(s.charAt(i)==s.charAt(j)){
                    if(i-j<2){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=dp[i-1][j+1];
                    }
                }
                if(dp[i][j]&&i-j+1>len){
                    start=j;
                    len=i-j+1;
                }
            }
        }
        return s.substring(start,start+len);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}