package com.tananaev.problems;

public class NthDigit {

    public int findNthDigit(int n) {
        n -= 1;
        int digits = 1;
        long range = 9;
        while (n > range * digits) {
            n -= range * digits;
            range *= 10;
            digits += 1;
        }
        long x = range / 9 + n / digits;
        return String.valueOf(x).charAt(n % digits) - '0';
    }

}
