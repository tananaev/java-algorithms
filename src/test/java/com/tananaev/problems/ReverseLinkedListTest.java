package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReverseLinkedListTest {

    @Test
    public void reverseList() throws Exception {
        ReverseLinkedList.ListNode n1 = new ReverseLinkedList.ListNode(1);
        ReverseLinkedList.ListNode n2 = new ReverseLinkedList.ListNode(2);
        ReverseLinkedList.ListNode n3 = new ReverseLinkedList.ListNode(3);
        n1.next = n2;
        n2.next = n3;

        assertEquals(n3, new ReverseLinkedList().reverseList(n1));
        assertEquals(n2, n3.next);
        assertEquals(n1, n2.next);
        assertNull(n1.next);
    }

}
