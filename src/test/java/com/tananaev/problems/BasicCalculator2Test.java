package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicCalculator2Test {

    @Test
    public void calculate() throws Exception {

        BasicCalculator2 calculator = new BasicCalculator2();

        assertEquals(7, calculator.calculate("3+2*2"));
        assertEquals(1, calculator.calculate("3/2"));
        assertEquals(5, calculator.calculate("3+5 / 2"));
        assertEquals(81, calculator.calculate(" 30 + 51 "));

    }

}
