package com.tananaev.queue;

public class Queue<T> {

    private Node<T> beginning;
    private Node<T> end;

    public Node<T> getBeginningNode() {
        return beginning;
    }

    public boolean isEmpty() {
        return beginning == null;
    }

    public void enqueue(T value) {
        Node<T> node = new Node<>();
        node.setValue(value);

        if (isEmpty()) {
            beginning = node;
        } else {
            node.setPrevious(end);
        }
        end = node;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> node = beginning;
            beginning = node.getNext();
            return node.getValue();
        }
    }

}
