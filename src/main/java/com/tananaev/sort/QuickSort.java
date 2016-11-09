package com.tananaev.sort;

public class QuickSort {

    private static <T extends Comparable<T>> void sort(T[] array, int left, int right) {
        if (left < right) {
            T median = array[(right + left) / 2];
            int leftIndex = left;
            int rightIndex = right;
            while (leftIndex < rightIndex) {
                while (array[leftIndex].compareTo(median) < 0) leftIndex += 1;
                while (median.compareTo(array[rightIndex]) < 0) rightIndex -= 1;

                T value = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = value;
            }
            sort(array, left, leftIndex);
            sort(array, rightIndex + 1, right);
        }
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        sort(array, 0, array.length - 1);
    }

}
