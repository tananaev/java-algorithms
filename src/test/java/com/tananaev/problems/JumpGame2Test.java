package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGame2Test {

    @Test
    public void jump() throws Exception {

        assertEquals(2, new JumpGame2().jump(new int[] {1,2,3}));
        assertEquals(2, new JumpGame2().jump(new int[] {2,3,1,1,4}));

    }

}
