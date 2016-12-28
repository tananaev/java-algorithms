package com.tananaev.problems;

public class KthSmallestElementInSortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        int[] indexes = new int[matrix.length];

        int element = 0;
        for (int i = 0; i < k; i++) {
            int row = 0;
            for (int j = 1; j < matrix.length; j++) {
                if (indexes[row] >= matrix.length || matrix[j][indexes[j]] < matrix[row][indexes[row]]) {
                    row = j;
                }
            }
            element = matrix[row][indexes[row]];
            indexes[row] += 1;
        }

        return element;
    }

}
