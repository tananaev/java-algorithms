package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FreedomTrailTest {

    @Test
    public void findRotateSteps() throws Exception {
        FreedomTrail solution = new FreedomTrail();
        //assertEquals(11, solution.findRotateSteps("iotfo", "fioot"));
        assertEquals(4, solution.findRotateSteps("godding", "gd"));
    }

}
