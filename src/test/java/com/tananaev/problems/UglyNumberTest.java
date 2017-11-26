package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UglyNumberTest {

    @Test
    public void isUgly() throws Exception {
        UglyNumber solution = new UglyNumber();
        assertEquals(false, solution.isUgly(14));
        assertEquals(true, solution.isUgly(6));
        assertEquals(true, solution.isUgly(8));
        assertEquals(true, solution.isUgly(1));
    }

}
