package com.tananaev.problems;

public class ReverseNodesInKGroup {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int filled = 0;
        ListNode[] batch = new ListNode[k];

        ListNode result = head;

        ListNode current = head;
        ListNode last = null;
        while (current != null) {
            batch[filled++] = current;
            ListNode next = current.next;

            if (filled == batch.length) {

                if (last == null) {
                    result = batch[filled - 1];
                } else {
                    last.next = batch[filled - 1];
                }

                for (int i = batch.length - 1; i > 0; i--) {
                    batch[i].next = batch[i - 1];
                }

                batch[0].next = next;
                last = batch[0];

                filled = 0;

            }

            current = next;
        }

        return result;
    }

}
