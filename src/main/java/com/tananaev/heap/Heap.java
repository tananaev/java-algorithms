package com.tananaev.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Heap<T extends Comparable<T>> {

    private List<T> data = new ArrayList<>();

    public Heap(T... values) {
        Collections.addAll(data, values);
        for (int i = data.size() - 1; i >= 0; i -= 1) {
            siftDown(i);
        }
    }

    public int getParentIndex(int i) {
        return (i - 1) / 2;
    }

    public int getLeftChildIndex(int i) {
        return 2 * i + 1;
    }

    public int getRightChildIndex(int i) {
        return 2 * i + 2;
    }

    public void swap(int i1, int i2) {
        T value = data.get(i1);
        data.set(i1, data.get(i2));
        data.set(i2, value);
    }

    public void siftUp(int i) {
        int parent = getParentIndex(i);
        if (parent >= 0 && data.get(i).compareTo(data.get(parent)) < 0) {
            swap(parent, i);
            siftUp(parent);
        }
    }

    public void siftDown(int i) {
        int child = getLeftChildIndex(i);
        if (child < data.size() && data.get(child).compareTo(data.get(i)) < 0) {
            swap(i, child);
            siftDown(child);
        }
        child = getRightChildIndex(i);
        if (child < data.size() && data.get(child).compareTo(data.get(i)) < 0) {
            swap(i, child);
            siftDown(child);
        }
    }

    public void push(T value) {
        data.add(value);
        siftUp(data.size() - 1);
    }

    public T pop() {
        T value = data.get(0);
        data.set(0, data.remove(data.size() - 1));
        siftDown(0);
        return value;
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
