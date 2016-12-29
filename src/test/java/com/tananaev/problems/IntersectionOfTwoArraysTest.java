package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionOfTwoArraysTest {

    public int[] a(int... i) {
        return i;
    }

    @Test
    public void intersection() throws Exception {
        assertArrayEquals(a(1, 2), new IntersectionOfTwoArrays().intersection(a(1, 2), a(2, 1)));
        assertArrayEquals(a(2), new IntersectionOfTwoArrays().intersection(a(1, 2, 2, 1), a(2, 2)));
    }

}
