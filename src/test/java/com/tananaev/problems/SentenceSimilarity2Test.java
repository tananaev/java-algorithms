package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SentenceSimilarity2Test {

    private String[] a(String... strings) {
        return strings;
    }

    @Test
    public void areSentencesSimilarTwo() throws Exception {
        SentenceSimilarity2 solution = new SentenceSimilarity2();
        assertEquals(true, solution.areSentencesSimilarTwo(
                a("great", "acting", "skills"), a("fine", "drama", "talent"),
                new String[][]{a("great", "good"), a("fine", "good"), a("acting","drama"), a("skills","talent")}));
    }

}
