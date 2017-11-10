package com.tananaev.problems;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        boolean zeroX = false;
        boolean zeroY = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        zeroX = true;
                    } else {
                        matrix[0][j] = 0;
                    }
                    if (j == 0) {
                        zeroY = true;
                    } else {
                        matrix[i][0] = 0;
                    }
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (zeroX) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if (zeroY) {
            for (int i = 1; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }

}
