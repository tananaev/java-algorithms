package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthDigitTest {

    @Test
    public void findNthDigit() throws Exception {
        NthDigit solution = new NthDigit();
        assertEquals(2, solution.findNthDigit(2147483647));
        assertEquals(3, solution.findNthDigit(3));
        assertEquals(0, solution.findNthDigit(11));
    }

}
