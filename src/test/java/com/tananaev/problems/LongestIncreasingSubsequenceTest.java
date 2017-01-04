package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void lengthOfLIS() throws Exception {
        assertEquals(1, new LongestIncreasingSubsequence().lengthOfLIS(new int[] {0}));
        assertEquals(4, new LongestIncreasingSubsequence().lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
    }

}