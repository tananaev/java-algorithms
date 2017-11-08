package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSizeSubarraySumTest {

    @Test
    public void minSubArrayLen() throws Exception {
        MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();
        assertEquals(0, solution.minSubArrayLen(3, new int[]{1,1}));
        assertEquals(2, solution.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }

}
