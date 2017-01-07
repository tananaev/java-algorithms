package com.tananaev.problems;

import java.util.LinkedList;

public class RemoveNthNodeFromEndOfList {

    public static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        LinkedList<ListNode> links = new LinkedList<>();

        ListNode node = head;
        while (node != null) {
            links.add(node);
            node = node.next;
            if (links.size() > n + 1) {
                links.removeFirst();
            }
        }

        if (links.size() > n) {
            links.getFirst().next = links.getFirst().next.next;
            return head;
        } else {
            return head.next;
        }
    }

}
