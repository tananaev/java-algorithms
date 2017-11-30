package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicDictionaryTest {

    @Test
    public void search() throws Exception {
        MagicDictionary solution = new MagicDictionary();
        solution.buildDict(new String[]{"hello", "leetcode"});
        assertEquals(false, solution.search("hello"));
        assertEquals(true, solution.search("hhllo"));
        assertEquals(false, solution.search("hell"));
        assertEquals(false, solution.search("leetcoded"));
    }

}
