package com.tananaev.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        Map<Character, Integer> stats = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (stats.containsKey(c)) {
                stats.put(c, stats.get(c) + 1);
            } else {
                stats.put(c, 1);
            }
        }

        int result = 0;
        boolean hasSingle = false;
        for (Map.Entry<Character, Integer> e : stats.entrySet()) {
            if (e.getValue() % 2 > 0) {
                hasSingle = true;
            }
            result += e.getValue() / 2 * 2;
        }
        if (hasSingle) {
            result += 1;
        }

        return result;
    }

}
