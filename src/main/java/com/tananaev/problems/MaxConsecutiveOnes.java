package com.tananaev.problems;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int from = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (nums[from] == 1 && i - from > max) {
                    max = i - from;
                }
                from = i;
            } else if (nums[from] != 1) {
                from = i;
            }
        }
        if (nums[from] == 1 && nums.length - from > max) {
            max = nums.length - from;
        }
        return max;
    }

}
