package com.tananaev.graph;

import java.util.HashSet;
import java.util.Set;

public class DepthSearch {

    public interface Callback<T> {
        void call(T value);
    }

    private static <T> void walk(Node<T> node, Set<Node<T>> processed, Callback<T> callback) {
        if (!processed.contains(node)) {
            callback.call(node.getValue());
            processed.add(node);
            for (Node<T> next : node.getNodes()) {
                walk(next, processed, callback);
            }
        }
    }

    public static <T> void walk(Node<T> node, Callback<T> callback) {
        Set<Node<T>> processed = new HashSet<>();
        walk(node, processed, callback);
    }

}
