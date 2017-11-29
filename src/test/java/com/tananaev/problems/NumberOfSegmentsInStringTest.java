package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfSegmentsInStringTest {

    @Test
    public void countSegments() throws Exception {
        NumberOfSegmentsInString solution = new NumberOfSegmentsInString();
        assertEquals(1, solution.countSegments("a"));
        assertEquals(5, solution.countSegments("Hello, my name is John"));
    }

}
