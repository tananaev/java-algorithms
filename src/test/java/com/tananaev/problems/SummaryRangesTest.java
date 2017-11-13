package com.tananaev.problems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SummaryRangesTest {

    @Test
    public void summaryRanges() throws Exception {
        SummaryRanges solution = new SummaryRanges();
        assertEquals(Arrays.asList("-2147483648->-2147483647","2147483647"), solution.summaryRanges(new int[]{-2147483648,-2147483647,2147483647}));
        assertEquals(Arrays.asList(), solution.summaryRanges(new int[]{}));
        assertEquals(Arrays.asList("0->2","4->5","7"), solution.summaryRanges(new int[]{0,1,2,4,5,7}));
        assertEquals(Arrays.asList("0","2->4","6","8->9"), solution.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }

}
