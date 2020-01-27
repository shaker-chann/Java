package LeetCode;

/**
 * @description: 61 旋转链表
 * @author: csc
 * @create: 2020/1/27 17:27
 */
public class RotateRight {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        ListNode pre = head;
        int sum = 0;
        while (pre != null) {
            sum++;
            if (pre.next == null) break;
            else pre = pre.next;
        }
        // 减少循环次数
        if (sum <= k) k = k % sum;
        if (k == 0) return head;
        sum = sum - k - 1;
        ListNode newHead = head;
        for (int i = 0; i < sum; i++) newHead = newHead.next;
        pre = newHead;
        newHead = newHead.next;
        ListNode tail = newHead;
        while (tail != null) {
            if (tail.next != null) tail = tail.next;
            else break;
        }
        pre.next = tail.next;
        tail.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode newH = rotateRight(head,1);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}