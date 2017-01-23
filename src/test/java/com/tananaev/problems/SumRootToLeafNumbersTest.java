package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumRootToLeafNumbersTest {

    @Test
    public void sumNumbers() throws Exception {
        SumRootToLeafNumbers.TreeNode n1 = new SumRootToLeafNumbers.TreeNode(1);
        SumRootToLeafNumbers.TreeNode n2 = new SumRootToLeafNumbers.TreeNode(2);
        SumRootToLeafNumbers.TreeNode n3 = new SumRootToLeafNumbers.TreeNode(3);
        n1.left = n2;
        n1.right = n3;
        assertEquals(25, new SumRootToLeafNumbers().sumNumbers(n1));
    }

}
