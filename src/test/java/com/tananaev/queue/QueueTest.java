package com.tananaev.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void isEmpty() throws Exception {
        Queue<String> queue = new Queue<>();
        assertTrue(queue.isEmpty());
        queue.enqueue("a");
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void enqueue() throws Exception {
        Queue<String> queue = new Queue<>();
        assertNull(queue.getBeginningNode());
        queue.enqueue("a");
        assertEquals("a", queue.getBeginningNode().getValue());
    }

    @Test
    public void dequeue() throws Exception {
        Queue<String> queue = new Queue<>();
        assertNull(queue.dequeue());
        queue.enqueue("a");
        assertEquals("a", queue.dequeue());
        assertNull(queue.getBeginningNode());
        assertNull(queue.dequeue());
    }

}
