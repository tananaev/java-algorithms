package com.tananaev.problems;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle2 {

    public static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        while (head != null) {
            if (nodes.contains(head)) {
                return head;
            }
            nodes.add(head);
            head = head.next;
        }
        return null;
    }

}
