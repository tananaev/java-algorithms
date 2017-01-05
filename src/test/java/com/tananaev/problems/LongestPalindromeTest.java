package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

    @Test
    public void longestPalindrome() throws Exception {
        assertEquals(7, new LongestPalindrome().longestPalindrome("abccccdd"));
    }

}
