package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShuffleAnArrayTest {

    @Test
    public void shuffle() throws Exception {
        ShuffleAnArray obj = new ShuffleAnArray(new int[]{1,2,3});
        int[] param_1 = obj.reset();
        int[] param_2 = obj.shuffle();
    }

}
