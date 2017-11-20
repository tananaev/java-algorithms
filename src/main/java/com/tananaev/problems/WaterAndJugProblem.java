package com.tananaev.problems;

import com.tananaev.stack.Stack;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WaterAndJugProblem {

    public boolean canMeasureWater(int x, int y, int z, Set<Map.Entry<Integer, Integer>> cache, Map.Entry<Integer, Integer> s) {
        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()) {
            s = stack.pop();
            if (!cache.contains(s)) {
                cache.add(s);
                if (s.getKey() == z || s.getValue() == z || s.getKey() + s.getValue() == z) {
                    return true;
                }
                if (s.getKey() < x) {
                    stack.push(new java.util.AbstractMap.SimpleEntry<>(x, s.getValue()));
                    int diff = Math.min(x - s.getKey(), s.getValue());
                    stack.push(new java.util.AbstractMap.SimpleEntry<>(s.getKey() + diff, s.getValue() - diff));
                }
                if (s.getValue() < y) {
                    stack.push(new java.util.AbstractMap.SimpleEntry<>(s.getKey(), y));
                    int diff = Math.min(y - s.getValue(), s.getKey());
                    stack.push(new java.util.AbstractMap.SimpleEntry<>(s.getKey() - diff, s.getValue() + diff));
                }
                if (s.getKey() > 0) {
                    stack.push(new java.util.AbstractMap.SimpleEntry<>(0, s.getValue()));
                }
                if (s.getValue() > 0) {
                    stack.push(new java.util.AbstractMap.SimpleEntry<>(s.getKey(), 0));
                }
            }
        }
        return false;
    }

    public boolean canMeasureWater(int x, int y, int z) {
        return canMeasureWater(x, y, z, new HashSet<>(), new java.util.AbstractMap.SimpleEntry<>(0, 0));
    }

}
