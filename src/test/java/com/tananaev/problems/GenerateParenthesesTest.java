package com.tananaev.problems;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {

    @Test
    public void generateParenthesis() throws Exception {
        assertEquals(Arrays.asList("((()))","(()())","(())()","()(())","()()()"), new GenerateParentheses().generateParenthesis(3));
    }

}
