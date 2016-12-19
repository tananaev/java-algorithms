package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycle2Test {

    @Test
    public void detectCycle() throws Exception {
        LinkedListCycle2.ListNode n1 = new LinkedListCycle2.ListNode(1);
        LinkedListCycle2.ListNode n2 = new LinkedListCycle2.ListNode(2);
        LinkedListCycle2.ListNode n3 = new LinkedListCycle2.ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n2;

        assertEquals(n2, new LinkedListCycle2().detectCycle(n1));
    }

}