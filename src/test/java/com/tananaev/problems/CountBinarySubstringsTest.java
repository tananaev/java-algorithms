package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountBinarySubstringsTest {

    @Test
    public void countBinarySubstrings() throws Exception {
        CountBinarySubstrings solution = new CountBinarySubstrings();
        assertEquals(6, solution.countBinarySubstrings("100111001"));
        assertEquals(2, solution.countBinarySubstrings("00100"));
        assertEquals(6, solution.countBinarySubstrings("00110011"));
        assertEquals(4, solution.countBinarySubstrings("10101"));
    }

}
