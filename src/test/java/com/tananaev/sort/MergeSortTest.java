package com.tananaev.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort1() throws Exception {
        Integer[] array = new Integer[] { 1, 5, 2, 4, 3 };
        MergeSort.sort(array);
        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5 }, array);
    }

    @Test
    public void sort2() throws Exception {
        Integer[] array = new Integer[] {};
        MergeSort.sort(array);
        assertArrayEquals(new Integer[] {}, array);
    }

    @Test
    public void sort3() throws Exception {
        Integer[] array = new Integer[] { 5, 4, 3, 2, 1 };
        MergeSort.sort(array);
        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5 }, array);
    }

}
