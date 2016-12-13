package com.tananaev.problems;

public class CountPrimes {

    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }

        boolean checked[] = new boolean[n];
        int count = n - 2;

        for (int i = 2; i < n; i += 1) {
            for (int j = 2; j * i < n; j += 1) {
                if (!checked[i * j]) {
                    count -= 1;
                    checked[i * j] = true;
                }
            }
        }

        return count;
    }

}
