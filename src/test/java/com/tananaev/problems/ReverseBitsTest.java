package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseBitsTest {

    @Test
    public void reverseBits() throws Exception {
        ReverseBits solution = new ReverseBits();
        assertEquals(964176192, solution.reverseBits(43261596));
    }

}
