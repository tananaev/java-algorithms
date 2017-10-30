package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidSquareTest {

    @Test
    public void validSquare() throws Exception {
        ValidSquare solution = new ValidSquare();
        assertTrue(solution.validSquare(new int[]{1,0}, new int[]{-1,0}, new int[]{0,1}, new int[]{0,-1}));
        assertTrue(solution.validSquare(new int[]{0,0}, new int[]{1,1}, new int[]{1,0}, new int[]{0,1}));
        assertFalse(solution.validSquare(new int[]{0,0}, new int[]{0,0}, new int[]{0,0}, new int[]{0,0}));
        assertFalse(solution.validSquare(new int[]{0,0}, new int[]{1,1}, new int[]{0,0}, new int[]{0,0}));
    }

}
