package com.tananaev.problems;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TrappingRainWater {

    public int trap(int[] height) {
        int result = 0;
        TreeMap<Integer, ArrayList<Integer>> heightMap = new TreeMap<>();
        for (int i = 0; i < height.length; i++) {
            if (!heightMap.containsKey(height[i])) {
                heightMap.put(height[i], new ArrayList<>());
            }
            heightMap.get(height[i]).add(i);
        }
        TreeSet<Integer> columnSet = new TreeSet<>();
        ArrayList<Map.Entry<Integer, ArrayList<Integer>>> heightList = new ArrayList<>(heightMap.entrySet());
        for (int i = heightList.size() - 1; i >= 0; i--) {
            columnSet.addAll(heightList.get(i).getValue());
            int min = columnSet.first();
            int max = columnSet.last();
            int exclude = columnSet.size();
            int sameHeight = heightList.get(i).getKey() - (i == 0 ? 0 : heightList.get(i - 1).getKey());
            result += sameHeight * (max - min + 1 - exclude);
        }
        return result;
    }

}
