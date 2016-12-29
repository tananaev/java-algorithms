package com.tananaev.problems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfTwoArrays {

    private TreeSet<Integer> setFrom(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : array) {
            set.add(i);
        }
        return set;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        TreeSet<Integer> set1 = setFrom(nums1);
        TreeSet<Integer> set2 = setFrom(nums2);
        Set<Integer> result = new HashSet<>();

        Iterator<Integer> i1 = set1.iterator();
        Iterator<Integer> i2 = set2.iterator();

        int elem1 = i1.next(), elem2 = i2.next();
        boolean move1 = false, move2 = false;
        while (true) {
            if (elem1 == elem2) {
                result.add(elem1);
                move1 = true;
                move2 = true;
            } else if (elem1 > elem2) {
                move2 = true;
            } else if (elem1 < elem2) {
                move1 = true;
            }

            if (move1) {
                if (i1.hasNext()) {
                    elem1 = i1.next();
                    move1 = false;
                } else {
                    break;
                }
            }
            if (move2) {
                if (i2.hasNext()) {
                    elem2 = i2.next();
                    move2 = false;
                } else {
                    break;
                }
            }
        }

        int index = 0;
        int[] array = new int[result.size()];
        for (int i : result) {
            array[index++] = i;
        }

        return array;
    }

}
