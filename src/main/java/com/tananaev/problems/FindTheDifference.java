package com.tananaev.problems;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> stats = new HashMap<>();

        for (char c : s.toCharArray()) {
            Integer count = stats.get(c);
            if (count == null) {
                count = 0;
            }
            stats.put(c, count + 1);
        }

        for (char c : t.toCharArray()) {
            Integer count = stats.get(c);
            if (count == null || count == 0) {
                return c;
            } else {
                stats.put(c, count - 1);
            }
        }

        return 0;
    }

}
