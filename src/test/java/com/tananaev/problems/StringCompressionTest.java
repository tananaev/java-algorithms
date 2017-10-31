package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCompressionTest {

    @Test
    public void compress() throws Exception {
        StringCompression solution = new StringCompression();
        assertEquals(1, solution.compress("a".toCharArray()));
        assertEquals(6, solution.compress("aabbccc".toCharArray()));
    }

}
