package solution.leetcode.editor.cn;
//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：0
// 
//
// 示例 4： 
//
// 
//输入：nums = [-1]
//输出：-1
// 
//
// 示例 5： 
//
// 
//输入：nums = [-100000]
//输出：-100000
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 3 * 104 
// -105 <= nums[i] <= 105 
// 
//
// 
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。 
// Related Topics 数组 分治 动态规划 
// 👍 3768 👎 0


/**
 * @author seaweed
 * @date 2021-09-28 16:31:09
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new MaximumSubarray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            int ans = nums[0];
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                //当前和加上nums[i]大于nums[i]就继续加，小于就舍弃，继续从i开始加
                sum = max(sum + nums[i], nums[i]);
                //记录过程中生成过的最大值
                ans = max(ans, sum);
            }
            return ans;
        }

        public int max(int a, int b) {
            return a > b ? a : b;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

