package com.tananaev.list.singly;

public class List<T> {

    public List(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    private Node<T> first;

    public Node<T> getFirstNode() {
        return first;
    }

    public void add(T value) {
        Node<T> node = new Node<>();
        node.setValue(value);

        if (first == null) {
            first = node;
        } else {
            Node current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public void insert(int index, T value) {
        Node<T> node = new Node<>();
        node.setValue(value);

        Node<T> previous = null;
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.getNext();
        }

        node.setNext(current);
        if (previous == null) {
            first = node;
        } else {
            previous.setNext(node);
        }
    }

    public void remove(int index) {
        Node<T> previous = null;
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.getNext();
        }

        if (previous == null) {
            first = current.getNext();
        } else {
            previous.setNext(current.getNext());
        }
    }

    public T get(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

}
