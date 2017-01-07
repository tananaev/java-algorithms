package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperUglyNumberTest {

    @Test
    public void nthSuperUglyNumber() throws Exception {
        assertEquals(32, new SuperUglyNumber().nthSuperUglyNumber(12, new int[] {2, 7, 13, 19}));
    }

}
