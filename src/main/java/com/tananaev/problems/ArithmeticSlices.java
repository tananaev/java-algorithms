package com.tananaev.problems;

public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) {
            return 0;
        }

        int result = 0;

        int start = 0;
        int diff = A[1] - A[0];

        for (int i = 2; i <= A.length; i++) {
            if (i == A.length || A[i] - A[i - 1] != diff) {
                if (i - start >= 3) {
                    for (int j = i - start; j >= 3; j--) {
                        result += i - start - j + 1;
                    }
                }
                if (i != A.length) {
                    start = i - 1;
                    diff = A[i] - A[i - 1];
                }
            }
        }

        return result;
    }

}
