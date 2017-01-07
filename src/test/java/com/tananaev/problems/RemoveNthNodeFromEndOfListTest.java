package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void removeNthFromEnd() throws Exception {
        RemoveNthNodeFromEndOfList.ListNode node = new RemoveNthNodeFromEndOfList.ListNode(1);
        node = new RemoveNthNodeFromEndOfList().removeNthFromEnd(node, 1);
    }

}