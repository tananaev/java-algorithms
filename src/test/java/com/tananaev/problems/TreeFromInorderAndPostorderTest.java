package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeFromInorderAndPostorderTest {

    @Test
    public void buildTree() throws Exception {
        TreeFromInorderAndPostorder.TreeNode root = new TreeFromInorderAndPostorder().buildTree(
                new int[]{4,2,5,1,3}, new int[]{4,5,2,3,1});
        assertEquals(1, root.val);
        assertEquals(2, root.left.val);
        assertEquals(3, root.right.val);
        assertEquals(4, root.left.left.val);
        assertEquals(5, root.left.right.val);
    }

}
