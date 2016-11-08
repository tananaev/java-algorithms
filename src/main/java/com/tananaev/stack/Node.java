package com.tananaev.stack;

public class Node<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private Node<T> next;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
