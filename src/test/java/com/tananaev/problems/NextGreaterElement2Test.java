package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextGreaterElement2Test {

    @Test
    public void nextGreaterElements() throws Exception {
        NextGreaterElement2 solution = new NextGreaterElement2();
        assertArrayEquals(new int[]{-1,-1,-1,-1,-1}, solution.nextGreaterElements(new int[]{1,1,1,1,1}));
        assertArrayEquals(new int[]{-1,5,5,5,5}, solution.nextGreaterElements(new int[]{5,4,3,2,1}));
        assertArrayEquals(new int[]{2,-1,2}, solution.nextGreaterElements(new int[]{1,2,1}));
    }

}
