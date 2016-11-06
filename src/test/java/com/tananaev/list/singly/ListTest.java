package com.tananaev.list.singly;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListTest {

    @Test
    public void add() throws Exception {
        List<String> list = new List<>();
        assertNull(list.getFirstNode());
        list.add("a");
        assertEquals("a", list.getFirstNode().getValue());
        list.add("b");
        assertEquals("a", list.getFirstNode().getValue());
        assertEquals("b", list.getFirstNode().getNext().getValue());
    }

    @Test
    public void insert() throws Exception {
        List<String> list = new List<>();
        list.insert(0, "b");
        assertEquals("b", list.getFirstNode().getValue());
        list.insert(1, "d");
        assertEquals("b", list.getFirstNode().getValue());
        assertEquals("d", list.getFirstNode().getNext().getValue());
        list.insert(1, "c");
        assertEquals("b", list.getFirstNode().getValue());
        assertEquals("c", list.getFirstNode().getNext().getValue());
        assertEquals("d", list.getFirstNode().getNext().getNext().getValue());
        list.insert(0, "a");
        assertEquals("a", list.getFirstNode().getValue());
        assertEquals("b", list.getFirstNode().getNext().getValue());
        assertEquals("c", list.getFirstNode().getNext().getNext().getValue());
        assertEquals("d", list.getFirstNode().getNext().getNext().getNext().getValue());
    }

    @Test
    public void remove() throws Exception {
        List<String> list = new List<>("a", "b", "c");
        list.remove(1);
        assertEquals("a", list.getFirstNode().getValue());
        assertEquals("c", list.getFirstNode().getNext().getValue());
        list.remove(0);
        assertEquals("c", list.getFirstNode().getValue());
        list.remove(0);
        assertNull(list.getFirstNode());
    }

    @Test
    public void get() throws Exception {
        List<String> list = new List<>("a", "b", "c");
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }

}
