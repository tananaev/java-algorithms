package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnesAndZeroesTest {

    @Test
    public void countPrimes() throws Exception {
        OnesAndZeroes solution = new OnesAndZeroes();
        assertEquals(4, solution.findMaxForm(new String[] {"10", "0001", "111001", "1", "0"}, 5, 3));
        assertEquals(2, solution.findMaxForm(new String[] {"10", "0", "1"}, 1, 1));
    }

}
