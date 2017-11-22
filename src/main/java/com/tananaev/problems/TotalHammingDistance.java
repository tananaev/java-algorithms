package com.tananaev.problems;

import java.util.Map;
import java.util.TreeMap;

public class TotalHammingDistance {

    public int hammingDistance(int left, int right) {
        int count = 0;
        int diff = left ^ right;
        int mask = 1;
        while (mask < 1000000000 && mask <= diff) {
            if ((diff & mask) > 0) {
                count += 1;
            }
            mask <<= 1;
        }
        return count;
    }

    public int totalHammingDistance(int[] nums) {
        Map<Integer, Integer> stat = new TreeMap<>();
        for (int n : nums) {
            Integer count = stat.get(n);
            stat.put(n, count != null ? count + 1 : 1);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> left : stat.entrySet()) {
            for (Map.Entry<Integer, Integer> right : stat.entrySet()) {
                if (left.getKey() < right.getKey()) {
                    count += hammingDistance(left.getKey(), right.getKey()) * left.getValue() * right.getValue();
                }
            }
        }

        return count;
    }

}
