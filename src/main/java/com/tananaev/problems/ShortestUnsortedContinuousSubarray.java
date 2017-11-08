package com.tananaev.problems;

public class ShortestUnsortedContinuousSubarray {

    private int max(int[] nums) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[max] > nums[i]) {
                return max;
            } else if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return -1;
    }

    private int min(int[] nums) {
        int min = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[min] < nums[i]) {
                return min;
            } else if (nums[min] > nums[i]) {
                min = i;
            }
        }
        return -1;
    }

    public int findUnsortedSubarray(int[] nums) {
        int from = max(nums);
        int to = min(nums);
        if (from < 0 || to < 0) {
            return 0;
        }
        int min = nums[from];
        for (int i = from; i <= to; i++) {
            min = Math.min(min, nums[i]);
        }
        int max = nums[from];
        for (int i = from; i <= to; i++) {
            max = Math.max(max, nums[i]);
        }
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min) {
                start = i;
                break;
            }
        }
        int end = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < max) {
                end = i;
                break;
            }
        }
        return end - start + 1;
    }

}
