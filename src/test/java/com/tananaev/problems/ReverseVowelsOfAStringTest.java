package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseVowelsOfAStringTest {

    @Test
    public void reverseVowels() throws Exception {
        ReverseVowelsOfAString solution = new ReverseVowelsOfAString();
        assertEquals("holle", solution.reverseVowels("hello"));
        assertEquals("leotcede", solution.reverseVowels("leetcode"));
    }

}
