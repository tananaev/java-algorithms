package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestConsecutiveSequenceTest {

    @Test
    public void longestConsecutive() throws Exception {
        assertEquals(3, new LongestConsecutiveSequence().longestConsecutive(new int[] {1,2,0,1}));
        assertEquals(7, new LongestConsecutiveSequence().longestConsecutive(new int[] {-5,-5,-4,8,3,1,-4,-6,-7,4,8,-1,8,-3,-8,-9,-7,-3,2,-8,5,-1,3,-8,-6}));
        assertEquals(9, new LongestConsecutiveSequence().longestConsecutive(new int[] {7,-2,9,9,1,9,8,-4,6,-6,-6,4,1,3,6,3,5,-2,3,4,-6,1,5,-9,6,1,2,-2,1}));
        assertEquals(4, new LongestConsecutiveSequence().longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
    }

}
