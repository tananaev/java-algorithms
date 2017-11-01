package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfLeftLeavesTest {

    @Test
    public void sumOfLeftLeaves() throws Exception {
        SumOfLeftLeaves.TreeNode tree = new SumOfLeftLeaves.TreeNode(3);
        tree.left = new SumOfLeftLeaves.TreeNode(9);
        tree.right = new SumOfLeftLeaves.TreeNode(20);
        tree.right.left = new SumOfLeftLeaves.TreeNode(15);
        tree.right.right = new SumOfLeftLeaves.TreeNode(7);
        assertEquals(24, new SumOfLeftLeaves().sumOfLeftLeaves(tree));
    }

}
