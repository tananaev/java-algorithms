package com.tananaev.problems;

public class InsertionSortList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode insertionSortList(ListNode head) {
        ListNode sorted = null;
        ListNode unsorted = head;
        while (unsorted != null) {
            ListNode node = unsorted;
            unsorted = node.next;

            ListNode current = null;
            ListNode next = sorted;
            while (next != null && node.val > next.val) {
                current = next;
                next = current.next;
            }

            if (current == null) {
                sorted = node;
                node.next = next;
            } else {
                current.next = node;
                node.next = next;
            }
        }
        return sorted;
    }

}
