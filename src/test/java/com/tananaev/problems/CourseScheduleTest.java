package com.tananaev.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseScheduleTest {

    @Test
    public void canFinish() throws Exception {
        CourseSchedule solution = new CourseSchedule();
        assertEquals(true, solution.canFinish(2, new int[][]{new int[]{1,0}}));
        assertEquals(false, solution.canFinish(2, new int[][]{new int[]{1,0}, new int[]{0,1}}));
    }

}
