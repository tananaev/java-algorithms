package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromicSubstringsTest {

    @Test
    public void countSubstrings() throws Exception {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        assertEquals(3, solution.countSubstrings("abc"));
        assertEquals(6, solution.countSubstrings("aaa"));
    }

}
