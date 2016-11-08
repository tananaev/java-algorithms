package com.tananaev.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void isEmpty() throws Exception {
        Stack<String> stack = new Stack<>();
        assertTrue(stack.isEmpty());
        stack.push("a");
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void push() throws Exception {
        Stack<String> stack = new Stack<>();
        assertNull(stack.getTopNode());
        stack.push("a");
        assertEquals("a", stack.getTopNode().getValue());
        stack.push("b");
        assertEquals("b", stack.getTopNode().getValue());
        assertEquals("a", stack.getTopNode().getNext().getValue());
    }

    @Test
    public void pop() throws Exception {
        Stack<String> stack = new Stack<>();
        assertNull(stack.getTopNode());
        assertNull(stack.pop());
        stack.push("a");
        stack.push("b");
        assertEquals("b", stack.getTopNode().getValue());
        assertEquals("a", stack.getTopNode().getNext().getValue());
        assertEquals("b", stack.pop());
        assertEquals("a", stack.pop());
        assertNull(stack.pop());
    }

}
