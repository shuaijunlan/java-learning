package cn.shuaijunlan.leetcoder.$237;

import cn.shuaijunlan.leetcoder.datastruc.ListNode;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 16:10 2017/5/2.
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
