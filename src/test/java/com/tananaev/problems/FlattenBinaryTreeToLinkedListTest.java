package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FlattenBinaryTreeToLinkedListTest {

    @Test
    public void flatten() throws Exception {
        FlattenBinaryTreeToLinkedList.TreeNode root = new FlattenBinaryTreeToLinkedList.TreeNode(1);
        root.left = new FlattenBinaryTreeToLinkedList.TreeNode(2);
        root.right = new FlattenBinaryTreeToLinkedList.TreeNode(5);
        root.left.left = new FlattenBinaryTreeToLinkedList.TreeNode(3);
        root.left.right = new FlattenBinaryTreeToLinkedList.TreeNode(4);
        root.right.right = new FlattenBinaryTreeToLinkedList.TreeNode(6);
        new FlattenBinaryTreeToLinkedList().flatten(root);
        assertEquals(1, root.val);
        assertEquals(2, root.right.val);
        assertEquals(3, root.right.right.val);
        assertEquals(4, root.right.right.right.val);
        assertEquals(5, root.right.right.right.right.val);
        assertEquals(6, root.right.right.right.right.right.val);
    }

}
