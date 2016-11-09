package com.tananaev.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void sort1() throws Exception {
        Integer[] array = new Integer[] { 1, 5, 2, 4, 3 };
        QuickSort.sort(array);
        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5 }, array);
    }

    @Test
    public void sort2() throws Exception {
        Integer[] array = new Integer[] {};
        QuickSort.sort(array);
        assertArrayEquals(new Integer[] {}, array);
    }

    @Test
    public void sort3() throws Exception {
        Integer[] array = new Integer[] { 5, 4, 3, 2, 1 };
        QuickSort.sort(array);
        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5 }, array);
    }

}
