package leetcode.editor.cn;
import util.*;
class question_67{
//给定两个二进制字符串，返回他们的和（用二进制表示）。 
//
// 输入为非空字符串且只包含数字 1 和 0。 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
// Related Topics 数学 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        int i=0,c=0;
        StringBuilder sb=new StringBuilder();

        while(a.length()-1-i>=0||b.length()-1-i>=0){
            int v=0,v1=0,v2=0;
            if(a.length()-1-i>=0){
                v1=a.charAt(a.length()-i-1)-'0';
            }
            if(b.length()-1-i>=0){
                v2=b.charAt(b.length()-i-1)-'0';
            }
            v=(v1+v2+c)%2;
            if(v1+v2+c>=2){
                c=1;
            }else{
                c=0;
            }
            i++;
            sb.append(v);
        }
        if(c!=0){
            sb.append(c);
        }
        sb.reverse();
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}