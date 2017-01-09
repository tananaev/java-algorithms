package com.tananaev.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> intervals = new HashMap<>();
        for (int i : nums) {
            if (intervals.containsKey(i - 1) && intervals.containsKey(i + 1)) {
                int end = intervals.get(i + 1);
                int start = intervals.get(i - 1);
                if (end > i && start < i) {
                    intervals.remove(i + 1);
                    intervals.remove(end);
                    intervals.remove(i - 1);
                    intervals.remove(start);
                    intervals.put(start, end);
                    intervals.put(end, start);
                } else if (start > i + 1) {
                    intervals.remove(i + 1);
                    intervals.remove(end);
                } else if (end < i - 1) {
                    intervals.remove(i - 1);
                    intervals.remove(start);
                }
            } if (intervals.containsKey(i - 1)) {
                int end = intervals.get(i - 1);
                if (end < i) {
                    intervals.remove(i - 1);
                    intervals.remove(end);
                    intervals.put(i, end);
                    intervals.put(end, i);
                }
            } else if (intervals.containsKey(i + 1)) {
                int end = intervals.get(i + 1);
                if (end > i) {
                    intervals.remove(i + 1);
                    intervals.remove(end);
                    intervals.put(i, end);
                    intervals.put(end, i);
                }
            } else if (!intervals.containsKey(i)) {
                intervals.put(i, i);
            }
        }

        int max = 0;
        for (Map.Entry<Integer, Integer> interval : intervals.entrySet()) {
            max = Math.max(max, interval.getKey() - interval.getValue() + 1);
        }

        return max;
    }

}
