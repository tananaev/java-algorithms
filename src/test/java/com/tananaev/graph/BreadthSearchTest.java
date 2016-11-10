package com.tananaev.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthSearchTest {

    @Test
    public void walk() throws Exception {
        Node<String> node1 = new Node<>("a");
        Node<String> node2 = new Node<>("b");
        Node<String> node3 = new Node<>("c");
        Node<String> node4 = new Node<>("d");
        node1.setNodes(node2, node3);
        node2.setNodes(node1, node4);
        node3.setNodes(node1);
        node4.setNodes(node2);

        StringBuilder s = new StringBuilder();

        BreadthSearch.walk(node1, s::append);

        assertEquals("abcd", s.toString());
    }

}
