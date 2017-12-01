package com.tananaev.problems;

public class UniqueBinarySearchTrees {

    public int numTrees(int n) {
        int[] nn = new int[n + 1];
        nn[0] = 1;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                count += nn[j] * nn[i - j - 1];
            }
            nn[i] = count;
        }
        return nn[n];
    }

}
