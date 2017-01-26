package com.tananaev.problems;

public class MaxSumOfRectangleNoLargerThanK {

    public int maxRange(int[] array, int k) {
        int max = Integer.MIN_VALUE;

        int[] sums = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                sums[j] += array[i];
                if (sums[j] > max && sums[j] <= k) {
                    max = sums[j];
                }
            }
        }

        return max;
    }

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int max = Integer.MIN_VALUE;

        for (int from = 0; from < matrix.length; from++) {
            int[] sums = new int[matrix[from].length];
            for (int to = from; to < matrix.length; to++) {
                for (int i = 0; i < matrix[from].length; i++) {
                    sums[i] += matrix[to][i];
                }
                max = Math.max(max, maxRange(sums, k));
            }
        }

        return max;
    }

}
