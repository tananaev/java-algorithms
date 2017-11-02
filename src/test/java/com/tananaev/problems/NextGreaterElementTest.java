package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextGreaterElementTest {

    @Test
    public void nextGreaterElement() throws Exception {
        NextGreaterElement solution = new NextGreaterElement();
        assertArrayEquals(new int[]{-1,3,-1}, solution.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
        assertArrayEquals(new int[]{3,-1}, solution.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}));
    }

}
