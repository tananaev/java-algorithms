package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetMatrixZeroesTest {

    @Test
    public void setZeroes() throws Exception {
        SetMatrixZeroes solution = new SetMatrixZeroes();
        int[][] m = {{1,2,3},{4,0,6},{4,5,6}};
        solution.setZeroes(m);
        assertEquals(1, m[0][0]);
        assertEquals(0, m[0][1]);
        assertEquals(3, m[0][2]);
        assertEquals(0, m[1][0]);
        assertEquals(0, m[1][1]);
        assertEquals(0, m[1][2]);
        assertEquals(4, m[2][0]);
        assertEquals(0, m[2][1]);
        assertEquals(6, m[2][2]);
    }

}
