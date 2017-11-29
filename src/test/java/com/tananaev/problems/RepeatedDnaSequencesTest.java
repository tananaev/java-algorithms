package com.tananaev.problems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class RepeatedDnaSequencesTest {

    @Test
    public void findRepeatedDnaSequences() throws Exception {
        RepeatedDnaSequences solution = new RepeatedDnaSequences();
        assertEquals(Arrays.asList("AAAAAAAAAA"), solution.findRepeatedDnaSequences("AAAAAAAAAAA"));
        assertEquals(Arrays.asList("AAAAACCCCC", "CCCCCAAAAA"), solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

}
