package com.tananaev.problems;

import java.util.TreeMap;

public class NextGreaterElement2 {

    public int[] nextGreaterElements(int[] nums) {
        TreeMap<Integer, Integer> firstRound = new TreeMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            Integer removeFrom = firstRound.floorKey(nums[i]);
            if (removeFrom != null) {
                firstRound.headMap(removeFrom, true).clear();
            }
            firstRound.put(nums[i], i);
        }
        int[] result = new int[nums.length];
        TreeMap<Integer, Integer> secondRound = new TreeMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            Integer key = secondRound.ceilingKey(nums[i] + 1);
            if (key != null) {
                result[i] = key;
            } else {
                key = firstRound.ceilingKey(nums[i] + 1);
                if (key != null) {
                    result[i] = key;
                } else {
                    result[i] = -1;
                }
            }
            Integer removeFrom = secondRound.floorKey(nums[i]);
            if (removeFrom != null) {
                secondRound.headMap(removeFrom, true).clear();
            }
            secondRound.put(nums[i], i);
        }
        return result;
    }

}
