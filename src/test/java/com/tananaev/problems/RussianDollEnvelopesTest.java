package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class RussianDollEnvelopesTest {

    public int[] a(int... i) {
        return i;
    }

    public int[][] a(int[]... i) {
        return i;
    }

    @Test
    public void maxEnvelopes() throws Exception {
        assertEquals(3, RussianDollEnvelopes.maxEnvelopes(a(a(5,4),a(6, 4),a(6,7),a(2,3))));
        assertEquals(5, RussianDollEnvelopes.maxEnvelopes(a(a(2,100),a(3,200),a(4,300),a(5,500),a(5,400),a(5,250),a(6,370),a(6,360),a(7,380))));
    }

}
