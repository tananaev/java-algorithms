package com.tananaev.problems;

import java.util.Arrays;
import java.util.Comparator;

public class RussianDollEnvelopes {

    public static int maxEnvelopes(int[][] envelopes, int from, int[] last) {
        if (from == envelopes.length) {
            return 0;
        } else {
            int countWith;
            if (last == null || envelopes[from][0] > last[0] && envelopes[from][1] > last[1]) {
                countWith = maxEnvelopes(envelopes, from + 1, envelopes[from]) + 1;
            } else {
                countWith = 0;
            }
            int countWithout = maxEnvelopes(envelopes, from + 1, last);
            return Math.max(countWith, countWithout);
        }
    }

    public static int maxEnvelopes(int[][] envelopes) {

        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        return maxEnvelopes(envelopes, 0, null);

    }

}
