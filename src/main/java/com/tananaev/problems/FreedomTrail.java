package com.tananaev.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class FreedomTrail {

    public int findRotateSteps(String ring, String key) {
        Map<Character, TreeSet<Integer>> stat = new HashMap<>();
        for (int i = 0; i < ring.length(); i++) {
            TreeSet<Integer> indexes = stat.computeIfAbsent(ring.charAt(i), k -> new TreeSet<>());
            indexes.add(i);
        }

        int count = 0;
        int location = 0;

        for (char c : key.toCharArray()) {
            if (ring.charAt(location) != c) {
                int nextLocation = 0;
                int nextSteps = Integer.MAX_VALUE;

                Integer option;
                int steps;

                option = stat.get(c).floor(location);
                if (option != null) {
                    steps = location - option;
                    if (steps < nextSteps) {
                        nextLocation = option;
                        nextSteps = steps;
                    }
                } else {
                    option = stat.get(c).floor(ring.length());
                    steps = location + ring.length() - option;
                    if (steps < nextSteps) {
                        nextLocation = option;
                        nextSteps = steps;
                    }
                }

                option = stat.get(c).ceiling(location);
                if (option != null) {
                    steps = option - location;
                    if (steps < nextSteps) {
                        nextLocation = option;
                        nextSteps = steps;
                    }
                } else {
                    option = stat.get(c).ceiling(-1);
                    steps = ring.length() - location + option;
                    if (steps < nextSteps) {
                        nextLocation = option;
                        nextSteps = steps;
                    }
                }

                count += nextSteps;
                location = nextLocation;
            }
            count += 1;
        }

        return count;
    }

}
