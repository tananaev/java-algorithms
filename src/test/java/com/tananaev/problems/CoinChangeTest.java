package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChangeTest {

    @Test
    public void coinChange() throws Exception {
        CoinChange solution = new CoinChange();
        assertEquals(20, solution.coinChange(new int[]{186,419,83,408}, 6249));
        assertEquals(3, solution.coinChange(new int[]{1,2,5}, 11));
        assertEquals(-1, solution.coinChange(new int[]{2}, 3));
    }

}
