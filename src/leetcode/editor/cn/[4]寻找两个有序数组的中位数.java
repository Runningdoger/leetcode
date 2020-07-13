package leetcode.editor.cn;
import util.*;
class question_4{
//给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。 
//
// 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。 
//
// 你可以假设 nums1 和 nums2 不会同时为空。 
//
// 示例 1: 
//
// nums1 = [1, 3]
//nums2 = [2]
//
//则中位数是 2.0
// 
//
// 示例 2: 
//
// nums1 = [1, 2]
//nums2 = [3, 4]
//
//则中位数是 (2 + 3)/2 = 2.5
// 
// Related Topics 数组 二分查找 分治算法


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int fi=(nums1.length+nums2.length+1)/2;
        int se=(nums1.length+nums2.length)/2+1;
        return (get(nums1,0,nums2,0,fi)+get(nums1,0,nums2,0,se))/2;
    }

    private double get(int[] nums1, int index1,int[] nums2, int index2,int fi) {
        if(index1==nums1.length){
            return nums2[index2+fi-1];
        }
        if(index2==nums2.length){
            return nums1[index1+fi-1];
        }
        if(fi==1){
            return Math.min(nums1[index1],nums2[index2]);
        }
        int k=Math.min(fi/2,Math.min(nums1.length-index1,nums2.length-index2));
        if(nums1[index1+k-1]>nums2[index2+k-1]){
            return get(nums1,index1,nums2,index2+k,fi-k);
        }else{
            return get(nums1,index1+k,nums2,index2,fi-k);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}