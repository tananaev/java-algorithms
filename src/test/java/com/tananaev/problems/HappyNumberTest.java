package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void isHappy() throws Exception {
        assertEquals(false, new HappyNumber().isHappy(2));
        assertEquals(true, new HappyNumber().isHappy(19));
    }

}
