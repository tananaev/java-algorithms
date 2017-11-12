package com.tananaev.problems;

public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int[][] paths = new int[m][];
        for (int i = 0; i < m; i++) {
            paths[i] = new int[n];
        }
        paths[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    paths[i][j] += paths[i - 1][j];
                }
                if (j > 0) {
                    paths[i][j] += paths[i][j - 1];
                }
            }
        }
        return paths[m - 1][n - 1];
    }

}
