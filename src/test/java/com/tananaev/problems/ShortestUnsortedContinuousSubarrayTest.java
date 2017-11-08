package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestUnsortedContinuousSubarrayTest {

    @Test
    public void findUnsortedSubarray() throws Exception {
        ShortestUnsortedContinuousSubarray solution = new ShortestUnsortedContinuousSubarray();
        assertEquals(3, solution.findUnsortedSubarray(new int[]{1,2,4,5,3}));
        assertEquals(2, solution.findUnsortedSubarray(new int[]{2,1}));
        assertEquals(0, solution.findUnsortedSubarray(new int[]{1,1}));
        assertEquals(4, solution.findUnsortedSubarray(new int[]{1,3,2,2,2}));
        assertEquals(5, solution.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }

}
