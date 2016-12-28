package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthSmallestElementInSortedMatrixTest {

    public int[] a(int... i) {
        return i;
    }

    public int[][] a(int[]... i) {
        return i;
    }

    @Test
    public void kthSmallest() throws Exception {

        KthSmallestElementInSortedMatrix solution = new KthSmallestElementInSortedMatrix();

        assertEquals(13, solution.kthSmallest(a(a(1,5,9), a(10, 11, 13), a(12, 13, 15)), 8));

    }

}
