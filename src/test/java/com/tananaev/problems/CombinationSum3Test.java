package com.tananaev.problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class CombinationSum3Test {

    @Test
    public void combinationSum3() throws Exception {

        assertEquals(Arrays.asList(Arrays.asList(1,2,4)), new CombinationSum3().combinationSum3(3, 7));
        assertEquals(Arrays.asList(Arrays.asList(1,2,6), Arrays.asList(1,3,5), Arrays.asList(2,3,4)), new CombinationSum3().combinationSum3(3, 9));

    }

}
