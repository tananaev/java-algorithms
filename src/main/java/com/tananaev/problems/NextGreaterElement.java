package com.tananaev.problems;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> places = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            places.put(nums2[i], i);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int next = -1;
            for (int j = places.get(nums1[i]) + 1; j < nums2.length; j++) {
                if (nums1[i] < nums2[j]) {
                    next = nums2[j];
                    break;
                }
            }
            result[i] = next;
        }
        return result;
    }

}
