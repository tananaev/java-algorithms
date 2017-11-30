package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoKeysKeyboardTest {

    @Test
    public void minSteps() throws Exception {
        TwoKeysKeyboard solution = new TwoKeysKeyboard();
        assertEquals(3, solution.minSteps(3));
    }

}
