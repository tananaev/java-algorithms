package com.tananaev.problems;


public class JumpGame2 {

    public int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        int i = 0;
        int steps = 0;
        int currentMax = 0;
        int nextMax = 0;

        while (currentMax < nums.length - 1) {
            for (; i <= currentMax; i++) {
                if (nextMax < i + nums[i]) {
                    nextMax = i + nums[i];
                }
            }
            steps += 1;
            currentMax = nextMax;
        }

        return steps;
    }

}
