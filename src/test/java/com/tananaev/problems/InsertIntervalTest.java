package com.tananaev.problems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertIntervalTest {

    public static InsertInterval.Interval i(int s, int e) {
        return new InsertInterval.Interval(s, e);
    }

    @Test
    public void insert() throws Exception {
        assertEquals(Arrays.asList(i(3,5), i(6,6), i(12,15)), new InsertInterval().insert(Arrays.asList(i(3,5), i(12,15)), i(6,6)));
        assertEquals(Arrays.asList(i(0,0), i(1,5)), new InsertInterval().insert(Arrays.asList(i(1,5)), i(0,0)));
        assertEquals(Arrays.asList(i(1,5)), new InsertInterval().insert(Arrays.asList(i(1,5)), i(2,3)));
        assertEquals(Arrays.asList(i(1,5), i(6,9)), new InsertInterval().insert(Arrays.asList(i(1,3), i(6,9)), i(2,5)));
    }

}
