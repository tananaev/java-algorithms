package com.tananaev.stack;

public class Stack<T> {

    private Node<T> top;

    public Node<T> getTopNode() {
        return top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T value) {
        Node<T> node = new Node<>();
        node.setValue(value);

        node.setNext(top);
        top = node;
    }

    public T pop() {
        if (top == null) {
            return null;
        } else {
            Node<T> node = top;
            top = node.getNext();
            return node.getValue();
        }
    }

}
