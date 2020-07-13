package leetcode.editor.cn;
import util.*;

import java.util.List;
class question_2{
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学


//leetcode submit region begin(Prohibit modification and deletion)


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //    public static void main(String[] args) {
//        ListNode l1=new ListNode(2);
//        l1.next=new ListNode(4);
//        l1.next.next=new ListNode(3);
//        ListNode l2=new ListNode(5);
//        l2.next=new ListNode(6);
//        l2.next.next=new ListNode(4);
//        ListNode l3=addTwoNumbers(l1,l2);
//
//    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;//2,4,3    5,6,4
        int c = 0;
        boolean flag1 = true;
        boolean flag2 = true;
        while (true) {
            int v1 = 0, v2 = 0;
            if (flag1) {
                v1 = l1.val;
            }
            if (flag2) {
                v2 = l2.val;
            }
            int number = v1 + v2 + c;
            ListNode l4 = new ListNode(number % 10);
            c = number / 10;
            l3 = insert(l3, l4);
            if (l1.next == null && l2.next == null) {
                if (c != 0) {
                    l3 = insert(l3, new ListNode(c));
                }
                break;
            }
            if (l1.next == null) {
                flag1 = false;
            } else {
                l1 = l1.next;
            }
            if (l2.next == null) {
                flag2 = false;
            } else {
                l2 = l2.next;
            }

        }
        return l3;
    }

    public ListNode insert(ListNode l1, ListNode l2) {
        ListNode l3 = l1;
        if (l3 == null) {
            l1 = l2;
            return l1;
        }
        while (l3.next != null) {
            l3 = l3.next;
        }
        l3.next = l2;
        return l1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
