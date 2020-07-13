package leetcode.editor.cn;
import util.*;
class question_14{
//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(i<strs[j].length()&&c==strs[j].charAt(i)){
                    if(j==strs.length-1){
                        sb.append(c);
                    }
                }else{
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}