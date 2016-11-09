package com.tananaev.sort;

public class MergeSort {

    private static <T extends Comparable<T>> T[] copy(T[] array, int from, int to) {
        T[] result = (T[]) new Comparable[to - from];
        System.arraycopy(array, from, result, 0, to - from);
        return result;
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        if (array.length >= 2) {
            int median = array.length / 2;
            T[] left = copy(array, 0, median);
            T[] right = copy(array, median, array.length);

            sort(left);
            sort(right);

            int i = 0;
            int j = 0;
            while (i < left.length || j < right.length) {
                if (j >= right.length || i < left.length && left[i].compareTo(right[j]) < 0) {
                    array[i + j] = left[i];
                    i += 1;
                } else {
                    array[i + j] = right[j];
                    j += 1;
                }
            }
        }
    }

}
