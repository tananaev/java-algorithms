package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConstructTheRectangleTest {

    @Test
    public void constructRectangle() throws Exception {
        ConstructTheRectangle solution = new ConstructTheRectangle();
        assertArrayEquals(new int[]{2,2}, solution.constructRectangle(4));
    }

}
