package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class SlidingWindowMaximumTest {

    public int[] a(int... i) {
        return i;
    }

    @Test
    public void maxSlidingWindow() throws Exception {
        SlidingWindowMaximum solution = new SlidingWindowMaximum();
        assertArrayEquals(a(7,7,7,7,7), solution.maxSlidingWindow(a(-7,-8,7,5,7,1,6,0), 4));
        assertArrayEquals(a(3,3,5,5,6,7), solution.maxSlidingWindow(a(1,3,-1,-3,5,3,6,7), 3));
        assertArrayEquals(a(), solution.maxSlidingWindow(a(), 0));
    }

}
