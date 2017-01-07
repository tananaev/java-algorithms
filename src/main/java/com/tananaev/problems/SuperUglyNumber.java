package com.tananaev.problems;

public class SuperUglyNumber {

    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int[] indexes = new int[primes.length];

        for (int i = 1; i < n; i++) {
            int number = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                number = Math.min(number, ugly[indexes[j]] * primes[j]);
            }
            ugly[i] = number;
            for (int j = 0; j < primes.length; j++) {
                if (ugly[indexes[j]] * primes[j] == number) {
                    indexes[j] += 1;
                }
            }
        }

        return ugly[n - 1];
    }

}
