package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationSequenceTest {

    @Test
    public void getPermutation() throws Exception {
        assertEquals("132", new PermutationSequence().getPermutation(3, 2));
        assertEquals("1", new PermutationSequence().getPermutation(1, 1));
    }

}
