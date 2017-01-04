package com.tananaev.problems;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = 0;
        int[] mins = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= max; j++) {
                if (j == 0 || nums[i] > mins[j]) {
                    if (j == max) {
                        mins[j + 1] = nums[i];
                        max = j + 1;
                    } else if (nums[i] < mins[j + 1]) {
                        mins[j + 1] = nums[i];
                    }
                }
            }
        }

        return max;
    }

}
