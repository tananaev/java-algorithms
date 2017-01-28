package com.tananaev.problems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class WordLadder2Test {

    @Test
    public void findLadders() throws Exception {
        assertEquals(Arrays.asList(Arrays.asList("hit","hot","dot","dog","cog"), Arrays.asList("hit","hot","lot","log","cog")),
                new WordLadder2().findLadders("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog")));
    }

}
