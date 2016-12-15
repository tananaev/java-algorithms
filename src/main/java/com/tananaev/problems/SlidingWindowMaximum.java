package com.tananaev.problems;

import java.util.TreeMap;

public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0 || nums.length < k) {
            return new int[0];
        }

        int[] result = new int[nums.length - k + 1];

        TreeMap<Integer, Integer> window = new TreeMap<>();
        for (int i = 0; i < k - 1; i++) {
            if (window.containsKey(nums[i])) {
                window.put(nums[i], window.get(nums[i]) + 1);
            } else {
                window.put(nums[i], 1);
            }
        }

        for (int i = k - 1; i < nums.length; i++) {
            if (i >= k) {
                if (window.get(nums[i - k]) > 1) {
                    window.put(nums[i - k], window.get(nums[i - k]) - 1);
                } else {
                    window.remove(nums[i - k]);
                }
            }
            if (window.containsKey(nums[i])) {
                window.put(nums[i], window.get(nums[i]) + 1);
            } else {
                window.put(nums[i], 1);
            }
            result[i - k + 1] = window.lastKey();
        }

        return result;
    }

}
