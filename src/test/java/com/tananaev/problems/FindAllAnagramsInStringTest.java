package com.tananaev.problems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindAllAnagramsInStringTest {

    @Test
    public void findAnagrams() throws Exception {
        assertEquals(Arrays.asList(0, 6), new FindAllAnagramsInString().findAnagrams("cbaebabacd", "abc"));
        assertEquals(Arrays.asList(0, 1, 2), new FindAllAnagramsInString().findAnagrams("abab", "ab"));
    }

}
