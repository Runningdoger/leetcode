package leetcode.editor.cn;
import util.*;

import java.util.ArrayList;
import java.util.List;
class question_22 {
//给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。 
//
// 例如，给出 n = 3，生成结果为： 
//
// [
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//]
// 
// Related Topics 字符串 回溯算法


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> list = new ArrayList<>();

        public List<String> generateParenthesis(int n) {
            dfs(n, 0, 0, "");
            return list;
        }

        public void dfs(int n, int left, int right, String s) {
            if (left == n && right == n) {
                list.add(s);
                return;
            }
            if (left == 0) {
                dfs(n, left + 1, 0, s + "(");
            }
            if (left < n && left != 0) {
                dfs(n, left + 1, right, s + "(");
            }
            if (right < n && right < left) {
                dfs(n, left, right + 1, s + ")");
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
