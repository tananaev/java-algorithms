package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxConsecutiveOnesTest {

    @Test
    public void findMaxConsecutiveOnes() throws Exception {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        assertEquals(3, solution.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        assertEquals(0, solution.findMaxConsecutiveOnes(new int[]{0,0}));
    }

}
