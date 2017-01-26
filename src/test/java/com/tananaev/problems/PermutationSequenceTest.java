package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationSequenceTest {

    @Test
    public void getPermutation() throws Exception {
        assertEquals("213", new PermutationSequence().getPermutation(3, 2));
        assertEquals("1", new PermutationSequence().getPermutation(1, 1));
        assertEquals("213", new PermutationSequence().getPermutation(4, 17));
        assertEquals("213", new PermutationSequence().getPermutation(4, 1));
        assertEquals("213", new PermutationSequence().getPermutation(4, 16));
    }

}
