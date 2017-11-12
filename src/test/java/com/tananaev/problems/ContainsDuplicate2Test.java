package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainsDuplicate2Test {

    @Test
    public void containsNearbyDuplicate() throws Exception {
        ContainsDuplicate2 solution = new ContainsDuplicate2();
        assertEquals(true, solution.containsNearbyDuplicate(new int[]{1,2,3,2}, 3));
    }

}
