package com.tananaev.problems;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubarrayProductLessThanKTest {

    @Ignore
    @Test
    public void numSubarrayProductLessThanK() throws Exception {
        SubarrayProductLessThanK solution = new SubarrayProductLessThanK();
        int[] large = new int[47220];
        for (int i = 0; i < large.length; i++) {
            large[i] = 1;
        }
        assertEquals(367968907, solution.numSubarrayProductLessThanK(large, 5));
        assertEquals(8, solution.numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
        assertEquals(18, solution.numSubarrayProductLessThanK(new int[]{10,9,10,4,3,8,3,3,6,2,10,10,9,3}, 19));
        assertEquals(0, solution.numSubarrayProductLessThanK(new int[]{1,2,3}, 0));
    }

}
