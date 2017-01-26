package com.tananaev.problems;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int min = Integer.MAX_VALUE;
        if (min == Integer.MAX_VALUE) {
            min = 1;
        }

        for (int i : nums) {
            if (i > 0 && i < min) {
                min = i;
            }
        }

        boolean[] exists = new boolean[nums.length + 1];

        for (int i : nums) {
            if (i > 0) {
                int index = i - min;
                if (index < exists.length) {
                    exists[index] = true;
                }
            }
        }

        for (int i = 0; i < exists.length; i++) {
            if (!exists[i]) {
                return i + min;
            }
        }

        return 0;
    }

}
