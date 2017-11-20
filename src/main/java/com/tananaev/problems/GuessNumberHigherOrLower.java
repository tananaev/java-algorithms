package com.tananaev.problems;

public class GuessNumberHigherOrLower {

    public int guess(int num) {
        int secret = 6;
        if (secret < num) return -1;
        else if (num < secret) return 1;
        else return 0;
    }

    public int guessNumber(int from, int to) {
        int median = (int) (((long) from + (long) to) / 2);
        int result = guess(median);
        if (result == 0) {
            return median;
        } else if (result < 0) {
            return guessNumber(0, median - 1);
        } else {
            return guessNumber(median + 1, to);
        }
    }

    public int guessNumber(int n) {
        return guessNumber(0, n);
    }

}
