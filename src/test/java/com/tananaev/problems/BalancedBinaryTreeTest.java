package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BalancedBinaryTreeTest {

    @Test
    public void isBalanced() throws Exception {
        BalancedBinaryTree.TreeNode tree = new BalancedBinaryTree.TreeNode(3);
        tree.left = new BalancedBinaryTree.TreeNode(4);
        tree.right = new BalancedBinaryTree.TreeNode(5);
        tree.left.left = new BalancedBinaryTree.TreeNode(1);
        tree.left.right = new BalancedBinaryTree.TreeNode(2);
        assertTrue(new BalancedBinaryTree().isBalanced(tree));
    }

}
