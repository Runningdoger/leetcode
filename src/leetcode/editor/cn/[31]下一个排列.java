package leetcode.editor.cn;
import util.*;
class question_31{
//实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。 
//
// 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。 
//
// 必须原地修改，只允许使用额外常数空间。 
//
// 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。 
//1,2,3 → 1,3,2 
//3,2,1 → 1,2,3 
//1,1,5 → 1,5,1 
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-1;i>=0;i--){
            if(i>0){
                if(nums[i]>nums[i-1]){
                    for(int j=i;j<nums.length;j++){
                        if(nums[j]>nums[i-1]&&(j+1>nums.length-1||nums[j+1]<=nums[i-1])){
                            int t=nums[j];
                            nums[j]=nums[i-1];
                            nums[i-1]=t;
                            System.out.println(i);
                            nums=reverse(nums,i,nums.length-1);

                            return;
                        }
                    }
                }
            }
        }
        nums=reverse(nums,0,nums.length-1);
    }

    public int[] reverse(int[] nums,int start,int end){
        for(int i=start;i<start+(end-start+1)/2;i++){
            int t=nums[i];
            nums[i]=nums[end-(i-start)];
            nums[end-(i-start)]=t;
        }
        return nums;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}