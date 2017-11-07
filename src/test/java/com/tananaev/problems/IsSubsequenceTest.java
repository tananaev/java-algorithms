package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsSubsequenceTest {

    @Test
    public void isSubsequence() throws Exception {
        IsSubsequence solution = new IsSubsequence();
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }

}
