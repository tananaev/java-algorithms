package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountPrimesTest {

    @Test
    public void countPrimes() throws Exception {
        CountPrimes solution = new CountPrimes();
        assertEquals(4, solution.countPrimes(10));
        assertEquals(41537, solution.countPrimes(499979));
        assertEquals(114155, solution.countPrimes(1500000));
    }

}
