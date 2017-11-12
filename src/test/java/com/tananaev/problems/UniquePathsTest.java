package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsTest {

    @Test
    public void uniquePaths() throws Exception {
        UniquePaths solution = new UniquePaths();
        assertEquals(2, solution.uniquePaths(2, 2));
    }

}
