package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstMissingPositiveTest {

    @Test
    public void firstMissingPositive() throws Exception {
        assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[] { }));
        assertEquals(3, new FirstMissingPositive().firstMissingPositive(new int[] { 1, 2, 0 }));
        assertEquals(2, new FirstMissingPositive().firstMissingPositive(new int[] { 3, 4, -1, 1 }));
    }

}