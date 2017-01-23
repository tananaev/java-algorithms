package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimplifyPathTest {

    @Test
    public void simplifyPath() throws Exception {
        assertEquals("/home", new SimplifyPath().simplifyPath("/home/"));
        assertEquals("/c", new SimplifyPath().simplifyPath("/a/./b/../../c/"));
    }

}
