package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsomorphicStringsTest {

    @Test
    public void isIsomorphic() throws Exception {
        IsomorphicStrings solution = new IsomorphicStrings();
        assertEquals(false, solution.isIsomorphic("ab", "aa"));
        assertEquals(true, solution.isIsomorphic("egg", "add"));
        assertEquals(false, solution.isIsomorphic("foo", "bar"));
        assertEquals(true, solution.isIsomorphic("paper", "title"));
    }

}
