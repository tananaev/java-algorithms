package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CountingBitsTest {

    @Test
    public void countBits() throws Exception {
        CountingBits solution = new CountingBits();
        assertArrayEquals(new int[]{0,1,1,2,1,2}, solution.countBits(5));
    }

}
