package com.tananaev.problems;

import java.util.ArrayList;

public class PermutationSequence {

    public String getPermutation(int n, int k) {
        int nx = 1;
        ArrayList<Integer> remaining = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            remaining.add(i);
            nx *= i;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (remaining.size() > 1) {
                nx /= remaining.size() - 1;
            }
            if (k == 0 || k == 1) {
                result.append(remaining.remove(0));
            } else {
                int index = k / nx;
                k = k % nx;
                result.append(remaining.remove(index));
            }
        }

        return result.toString();
    }

}
