package com.tananaev.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    public boolean containsNearby(ArrayList<Integer> indexes, int k) {
        for (int i = 1; i < indexes.size(); i++) {
            if (indexes.get(i) - indexes.get(i - 1) <= k) {
                return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, ArrayList<Integer>> stat = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!stat.containsKey(nums[i])) {
                stat.put(nums[i], new ArrayList<>());
            }
            stat.get(nums[i]).add(i);
        }
        for (ArrayList<Integer> indexes : stat.values()) {
            if (containsNearby(indexes, k)) {
                return true;
            }
        }
        return false;
    }

}
