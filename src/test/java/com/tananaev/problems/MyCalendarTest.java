package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCalendarTest {

    @Test
    public void book() throws Exception {
        MyCalendar solution = new MyCalendar();
        /*assertEquals(true, solution.book(1, 5));
        assertEquals(true, solution.book(10, 15));
        assertEquals(false, solution.book(2, 4));
        assertEquals(false, solution.book(3, 7));
        assertEquals(false, solution.book(7, 13));*/
        assertEquals(true, solution.book(10, 20));
        assertEquals(false, solution.book(15, 25));
        assertEquals(true, solution.book(20, 30));
    }

}
