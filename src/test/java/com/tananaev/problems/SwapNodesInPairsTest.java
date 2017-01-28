package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesInPairsTest {

    @Test
    public void swapPairs() throws Exception {

        SwapNodesInPairs.ListNode n1 = new SwapNodesInPairs.ListNode(1);
        SwapNodesInPairs.ListNode n2 = new SwapNodesInPairs.ListNode(2);
        SwapNodesInPairs.ListNode n3 = new SwapNodesInPairs.ListNode(3);
        SwapNodesInPairs.ListNode n4 = new SwapNodesInPairs.ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        SwapNodesInPairs.ListNode n = new SwapNodesInPairs().swapPairs(n1);

        assertEquals(2, n.val);
        assertEquals(1, n.next.val);
        assertEquals(4, n.next.next.val);
        assertEquals(3, n.next.next.next.val);

    }

}
