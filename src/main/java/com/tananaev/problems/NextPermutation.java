package com.tananaev.problems;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int sortFrom = 0;
        Map<Integer, Integer> tail = new TreeMap<>();
        outer: for (int i = nums.length - 1; i >= 0; i--) {
            for (Map.Entry<Integer, Integer> entry : tail.entrySet()) {
                if (entry.getKey() > nums[i]) {
                    nums[entry.getValue()] = nums[i];
                    nums[i] = entry.getKey();
                    sortFrom = i + 1;
                    break outer;
                }
            }
            tail.put(nums[i], i);
        }
        Arrays.sort(nums, sortFrom, nums.length);
    }

}
