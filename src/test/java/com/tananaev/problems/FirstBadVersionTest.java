package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstBadVersionTest {

    @Test
    public void firstBadVersion() throws Exception {
        FirstBadVersion solution = new FirstBadVersion();
        assertEquals(1702766719, solution.firstBadVersion(2126753390));
        //assertEquals(1, solution.firstBadVersion(2));
        //assertEquals(1, solution.firstBadVersion(1));
        //assertEquals(1, solution.firstBadVersion(10));
    }

}
