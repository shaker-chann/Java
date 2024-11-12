package LeetCode.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * @Description:
 * @PackageName: LeetCode.collection
 * @Author: csc
 * @Create: 2022-10-12 9:45
 * @Version: 1.0
 */
public class ListNodeMain {
    public static void main(String[] args) {
        ListNodeMain main = new ListNodeMain();
        ListNode l0 = new ListNode(3);
        ListNode l1 = new ListNode(1, l0);
        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(4, l2);

//        main.numComponents()
        System.out.println(main.sortList(l3));

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), cur = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) cur.next = new ListNode(carry);
        return head.next;
    }

    public ListNode sortList(ListNode head) {
        return sortList(head, null);
    }

    private ListNode sortList(ListNode head, ListNode tail) {
        if (head == null) return null;
        if (head.next == tail) {
            head.next = null;
            return head;
        }
        ListNode slow = head, fast = head;
        while (fast != tail) {
            slow = slow.next;
            fast = fast.next;
            if (fast != tail) fast = fast.next;
        }
        ListNode mid = slow;
        ListNode left = sortList(head, mid);
        ListNode right = sortList(mid, tail);
        ListNode sorted = merge(left, right);
        return sorted;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode head = new ListNode();
        ListNode t = head, l = left, r = right;
        while (l != null && r != null) {
            if (l.val <= r.val) {
                t.next = l;
                l = l.next;
            } else {
                t.next = r;
                r = r.next;
            }
            t = t.next;
        }
        if (l != null) {
            t.next = l;
        } else if (r != null) {
            t.next = r;
        }
        return head.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val) return -1;
                else if (o1.val == o2.val) return 0;
                else return 1;
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for (ListNode node : lists) {
            if (node != null) queue.add(node);
        }
        while (!queue.isEmpty()) {
            p.next = queue.poll();
            p = p.next;
            if (p.next != null) queue.add(p.next);
        }
        return dummy.next;
    }

    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int ans = 0;
        boolean toNext = false;
        while (head != null) {
            if (set.contains(head.val)) {
                if (!toNext) ans++;
                toNext = true;
            } else {
                toNext = false;
            }
            head = head.next;
        }
        return ans;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
