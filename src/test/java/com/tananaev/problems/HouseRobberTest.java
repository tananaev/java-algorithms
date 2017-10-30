package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberTest {

    @Test
    public void rob() throws Exception {
        HouseRobber solution = new HouseRobber();
        assertEquals(17, solution.rob(new int[] { 10, 0, 2, 0, 0, 5, 3 }));
    }

}
