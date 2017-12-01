package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueBinarySearchTreesTest {

    @Test
    public void numTrees() throws Exception {
        UniqueBinarySearchTrees solution = new UniqueBinarySearchTrees();
        assertEquals(5, solution.numTrees(3));
    }

}
