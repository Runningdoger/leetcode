package solution.leetcode.editor.cn;
//给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。 
//
// 设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。 
//
// 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。 
//
// 
//
// 示例 1: 
//
// 
//输入：prices = [3,3,5,0,0,3,1,4]
//输出：6
//解释：在第 4 天（股票价格 = 0）的时候买入，在第 6 天（股票价格 = 3）的时候卖出，这笔交易所能获得利润 = 3-0 = 3 。
//     随后，在第 7 天（股票价格 = 1）的时候买入，在第 8 天 （股票价格 = 4）的时候卖出，这笔交易所能获得利润 = 4-1 = 3 。 
//
// 示例 2： 
//
// 
//输入：prices = [1,2,3,4,5]
//输出：4
//解释：在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。   
//     注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。   
//     因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
// 
//
// 示例 3： 
//
// 
//输入：prices = [7,6,4,3,1] 
//输出：0 
//解释：在这个情况下, 没有交易完成, 所以最大利润为 0。 
//
// 示例 4： 
//
// 
//输入：prices = [1]
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= prices.length <= 10⁵ 
// 0 <= prices[i] <= 10⁵ 
// 
// Related Topics 数组 动态规划 👍 896 👎 0


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author seaweed
 * @date 2021-10-20 14:22:09
 * @QuestionId 123    题目编号
 */
public class BestTimeToBuyAndSellStockIii {
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStockIii().new Solution();
        solution.maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //计算出所有递增数列的值，找出最大的两个
        public int maxProfit(int[] prices) {
            int[][] d = new int[prices.length + 5][2];
            int min=prices[0];
            for(int i=0;i<prices.length;i++){
                if(i!=0){
                    d[i][0]=Math.max(d[i-1][0],prices[i]-min);
                }else{
                    d[i][0]=0;
                }
                min=Math.min(min,prices[i]);
            }
            int max=prices[prices.length-1];
            for(int i=prices.length-1;i>=0;i--){
                if(i!=prices.length-1){
                    d[i][1]=Math.max(d[i+1][1],max-prices[i]);
                }else{
                    d[i][1]=0;
                }
                max=Math.max(max,prices[i]);
            }
            int res=0;
            for(int i=0;i<prices.length;i++){
                res=Math.max(res,d[i][0]+d[i+1][1]);
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

