package com.tananaev.problems;

public class MaxSumOfRectangleNoLargerThanK {

    public int sum(int[][] matrix, int x1, int y1, int x2, int y2) {
        int result = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                result += matrix[i][j];
            }
        }
        return result;
    }

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int max = Integer.MIN_VALUE;
        for (int x1 = 0; x1 < matrix.length; x1++) {
            for (int y1 = 0; y1 < matrix[x1].length; y1++) {
                for (int x2 = x1; x2 < matrix.length; x2++) {
                    for (int y2 = y1; y2 < matrix[x2].length; y2++) {
                        int s = sum(matrix, x1, y1, x2, y2);
                        if (s > max && s <= k) {
                            max = s;
                        }
                    }
                }
            }
        }
        return max;
    }

}
