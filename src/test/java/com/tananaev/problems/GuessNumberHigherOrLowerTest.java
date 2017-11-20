package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberHigherOrLowerTest {

    @Test
    public void guessNumber() throws Exception {
        GuessNumberHigherOrLower solution = new GuessNumberHigherOrLower();
        assertEquals(6, solution.guessNumber(10));
    }

}
