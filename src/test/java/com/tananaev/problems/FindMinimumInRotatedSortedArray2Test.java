package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinimumInRotatedSortedArray2Test {

    @Test
    public void findMin() throws Exception {
        FindMinimumInRotatedSortedArray2 solution = new FindMinimumInRotatedSortedArray2();
        assertEquals(1, solution.findMin(new int[]{10,1,10,10,10}));
        assertEquals(1, solution.findMin(new int[]{3,1,3}));
        assertEquals(1, solution.findMin(new int[]{1}));
        assertEquals(0, solution.findMin(new int[]{0,1,2}));
        assertEquals(0, solution.findMin(new int[]{4,5,6,7,0,1,2}));
        assertEquals(-1, solution.findMin(new int[]{}));
    }

}
