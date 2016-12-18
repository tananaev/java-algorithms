package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextPermutationTest {

    @Test
    public void nextPermutation() throws Exception {
        NextPermutation solution = new NextPermutation();

        int[] a0 = new int[] {1,2};
        solution.nextPermutation(a0);
        assertArrayEquals(new int[] {2,1}, a0);

        int[] a1 = new int[] {1,2,3};
        solution.nextPermutation(a1);
        assertArrayEquals(new int[] {1,3,2}, a1);

        int[] a2 = new int[] {3,2,1};
        solution.nextPermutation(a2);
        assertArrayEquals(new int[] {1,2,3}, a2);

        int[] a3 = new int[] {1,1,5};
        solution.nextPermutation(a3);
        assertArrayEquals(new int[] {1,5,1}, a3);

        int[] a4 = new int[] {1,3,2};
        solution.nextPermutation(a4);
        assertArrayEquals(new int[] {2,1,3}, a4);
    }

}
