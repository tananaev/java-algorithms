package com.tananaev.problems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergeIntervalsTest {

    private MergeIntervals.Interval i(int s, int e) {
        return new MergeIntervals.Interval(s, e);
    }

    @Test
    public void merge() throws Exception {
        MergeIntervals solution = new MergeIntervals();
        assertEquals(Arrays.asList(i(1,6),i(8,10),i(15,18)), solution.merge(Arrays.asList(i(1,3),i(2,6),i(8,10),i(15,18))));
    }

}
