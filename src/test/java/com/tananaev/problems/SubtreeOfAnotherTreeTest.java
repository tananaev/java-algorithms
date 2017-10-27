package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SubtreeOfAnotherTreeTest {

    @Test
    public void checkTrue() throws Exception {
        SubtreeOfAnotherTree.TreeNode first = new SubtreeOfAnotherTree.TreeNode(3);
        first.left = new SubtreeOfAnotherTree.TreeNode(4);
        first.right = new SubtreeOfAnotherTree.TreeNode(5);
        first.left.left = new SubtreeOfAnotherTree.TreeNode(1);
        first.left.right = new SubtreeOfAnotherTree.TreeNode(2);
        SubtreeOfAnotherTree.TreeNode second = new SubtreeOfAnotherTree.TreeNode(4);
        second.left = new SubtreeOfAnotherTree.TreeNode(1);
        second.right = new SubtreeOfAnotherTree.TreeNode(2);
        assertTrue(new SubtreeOfAnotherTree().isSubtree(first, second));
    }

    @Test
    public void checkFalse() throws Exception {
        SubtreeOfAnotherTree.TreeNode first = new SubtreeOfAnotherTree.TreeNode(3);
        first.left = new SubtreeOfAnotherTree.TreeNode(4);
        first.right = new SubtreeOfAnotherTree.TreeNode(5);
        first.left.left = new SubtreeOfAnotherTree.TreeNode(1);
        first.left.right = new SubtreeOfAnotherTree.TreeNode(2);
        first.left.right.left = new SubtreeOfAnotherTree.TreeNode(0);
        SubtreeOfAnotherTree.TreeNode second = new SubtreeOfAnotherTree.TreeNode(4);
        second.left = new SubtreeOfAnotherTree.TreeNode(1);
        second.right = new SubtreeOfAnotherTree.TreeNode(2);
        assertFalse(new SubtreeOfAnotherTree().isSubtree(first, second));
    }

}
