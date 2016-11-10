package com.tananaev.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Node<T> {

    public Node(T value) {
        this.value = value;
    }

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private List<Node<T>> nodes = new ArrayList<>();

    public void setNodes(Node<T>... nodes) {
        this.nodes.addAll(Arrays.asList(nodes));
    }

    public Collection<Node<T>> getNodes() {
        return nodes;
    }

}
