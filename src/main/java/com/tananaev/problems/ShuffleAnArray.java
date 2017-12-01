package com.tananaev.problems;

import java.util.ArrayList;
import java.util.Random;

public class ShuffleAnArray {

    private Random random = new Random();

    private int[] original;
    private int[] array;

    public ShuffleAnArray(int[] nums) {
        original = new int[nums.length];
        for (int i = 0; i < original.length; i++) {
            original[i] = nums[i];
        }
        array = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        for (int i = 0; i < array.length; i++) {
            array[i] = original[i];
        }
        return array;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        ArrayList<Integer> remaining = new ArrayList<>();
        for (int i = 0; i < original.length; i++) {
            remaining.add(original[i]);
        }
        for (int i = 0; i < original.length; i++) {
            array[i] = remaining.remove(random.nextInt(remaining.size()));
        }
        return array;
    }

}
