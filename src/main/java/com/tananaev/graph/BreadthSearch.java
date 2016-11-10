package com.tananaev.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthSearch {

    public interface Callback<T> {
        void call(T value);
    }

    private static <T> void walk(Node<T> node, Set<Node<T>> processed, DepthSearch.Callback<T> callback) {
        Queue<Node<T>> queue =  new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node<T> item = queue.remove();
            if (!processed.contains(item)) {
                callback.call(item.getValue());
                processed.add(item);
                queue.addAll(item.getNodes());
            }
        }
    }

    public static <T> void walk(Node<T> node, DepthSearch.Callback<T> callback) {
        Set<Node<T>> processed = new HashSet<>();
        walk(node, processed, callback);
    }

}
