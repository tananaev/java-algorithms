package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterAndJugProblemTest {

    @Test
    public void canMeasureWater() throws Exception {
        WaterAndJugProblem solution = new WaterAndJugProblem();
        assertEquals(true, solution.canMeasureWater(104681, 104683, 54));
        assertEquals(true, solution.canMeasureWater(104597, 104623, 123));
        assertEquals(true, solution.canMeasureWater(22003, 31237, 1));
        assertEquals(true, solution.canMeasureWater(3, 5, 4));
        assertEquals(false, solution.canMeasureWater(2, 6, 5));
    }

}
