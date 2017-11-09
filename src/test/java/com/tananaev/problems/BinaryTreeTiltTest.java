package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTiltTest {

    @Test
    public void findTilt() throws Exception {
        BinaryTreeTilt.TreeNode tree = new BinaryTreeTilt.TreeNode(1);
        tree.left = new BinaryTreeTilt.TreeNode(2);
        tree.right = new BinaryTreeTilt.TreeNode(3);
        assertEquals(1, new BinaryTreeTilt().findTilt(tree));
    }

}
