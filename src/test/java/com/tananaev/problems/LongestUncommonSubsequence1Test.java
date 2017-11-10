package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestUncommonSubsequence1Test {

    @Test
    public void findLUSlength() throws Exception {
        LongestUncommonSubsequence1 solution = new LongestUncommonSubsequence1();
        assertEquals(3, solution.findLUSlength("aba", "cdc"));
    }

}
