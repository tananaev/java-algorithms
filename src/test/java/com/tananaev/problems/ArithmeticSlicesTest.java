package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticSlicesTest {

    @Test
    public void numberOfArithmeticSlices() throws Exception {
        assertEquals(2, new ArithmeticSlices().numberOfArithmeticSlices(new int[] {1,2,3,8,9,10}));
        assertEquals(3, new ArithmeticSlices().numberOfArithmeticSlices(new int[] {1, 2, 3, 4}));
    }

}
