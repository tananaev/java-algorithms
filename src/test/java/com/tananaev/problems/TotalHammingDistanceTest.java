package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TotalHammingDistanceTest {

    @Test
    public void totalHammingDistance() throws Exception {
        TotalHammingDistance solution = new TotalHammingDistance();
        assertEquals(6, solution.totalHammingDistance(new int[]{4,14,2}));
    }

}
