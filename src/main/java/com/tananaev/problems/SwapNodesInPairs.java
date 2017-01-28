package com.tananaev.problems;

public class SwapNodesInPairs {

    public static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode result = head;

        ListNode current = head;
        ListNode next;

        ListNode last = null;

        while (current != null && current.next != null) {
            next = current.next;

            if (last == null) {
                result = next;
            } else {
                last.next = next;
            }

            current.next = next.next;
            next.next = current;

            last = current;
            current = current.next;
        }

        return result;
    }

}
