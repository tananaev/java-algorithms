package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseNodesInKGroupTest {

    @Test
    public void reverseKGroup1() throws Exception {
        ReverseNodesInKGroup.ListNode n1 = new ReverseNodesInKGroup.ListNode(1);
        ReverseNodesInKGroup.ListNode n2 = new ReverseNodesInKGroup.ListNode(2);
        ReverseNodesInKGroup.ListNode n3 = new ReverseNodesInKGroup.ListNode(3);
        ReverseNodesInKGroup.ListNode n4 = new ReverseNodesInKGroup.ListNode(4);
        ReverseNodesInKGroup.ListNode n5 = new ReverseNodesInKGroup.ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ReverseNodesInKGroup.ListNode n = new ReverseNodesInKGroup().reverseKGroup(n1, 2);

        assertEquals(2, n.val);
        assertEquals(1, n.next.val);
        assertEquals(4, n.next.next.val);
        assertEquals(3, n.next.next.next.val);
        assertEquals(5, n.next.next.next.next.val);
    }

    @Test
    public void reverseKGroup2() throws Exception {
        ReverseNodesInKGroup.ListNode n1 = new ReverseNodesInKGroup.ListNode(1);

        ReverseNodesInKGroup.ListNode n = new ReverseNodesInKGroup().reverseKGroup(n1, 2);

        assertEquals(1, n.val);
    }

}
