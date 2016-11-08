package com.tananaev.heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeapTest {

    @Test
    public void construct() throws Exception {
        Heap<Integer> heap;
        heap = new Heap<>(3, 2, 1);
        assertEquals("[1, 3, 2]", heap.toString());
        heap = new Heap<>(5, 4, 3, 2, 1);
        assertEquals("[1, 2, 3, 5, 4]", heap.toString());
    }

    @Test
    public void push() throws Exception {
        Heap<Integer> heap = new Heap<>(4, 3, 2);
        assertEquals("[2, 4, 3]", heap.toString());
        heap.push(1);
        assertEquals("[1, 2, 3, 4]", heap.toString());
        heap.push(5);
        assertEquals("[1, 2, 3, 4, 5]", heap.toString());
    }

    @Test
    public void pop() throws Exception {
        Heap<Integer> heap = new Heap<>(5, 4, 3, 2, 1);
        assertEquals("[1, 2, 3, 5, 4]", heap.toString());
        assertEquals(1, heap.pop().intValue());
        assertEquals("[2, 4, 3, 5]", heap.toString());
        assertEquals(2, heap.pop().intValue());
        assertEquals("[3, 5, 4]", heap.toString());
    }

}
