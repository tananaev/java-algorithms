package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class InsertionSortListTest {

    @Test
    public void insertionSortList() throws Exception {
        InsertionSortList solution = new InsertionSortList();
        InsertionSortList.ListNode n1 = new InsertionSortList.ListNode(2);
        InsertionSortList.ListNode n2 = new InsertionSortList.ListNode(1);
        InsertionSortList.ListNode n3 = new InsertionSortList.ListNode(3);
        n1.next = n2;
        n2.next = n3;
        InsertionSortList.ListNode root = solution.insertionSortList(n1);
        assertEquals(1, root.val);
        assertEquals(2, root.next.val);
        assertEquals(3, root.next.next.val);
        assertNull(root.next.next.next);
    }

}
