package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumOfRectangleNoLargerThanKTest {

    public int[] a(int... i) {
        return i;
    }

    public int[][] a(int[]... i) {
        return i;
    }

    @Test
    public void maxSumSubmatrix() throws Exception {
        assertEquals(3, new MaxSumOfRectangleNoLargerThanK().maxSumSubmatrix(new int[][] { a(2, 2, -1) }, 3));
        assertEquals(2, new MaxSumOfRectangleNoLargerThanK().maxSumSubmatrix(a(a(1, 0, 1), a(0, -2, 3)), 2));
    }

}
