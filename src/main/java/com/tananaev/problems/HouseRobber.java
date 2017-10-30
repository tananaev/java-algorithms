package com.tananaev.problems;

public class HouseRobber {

    public int rob(int[] nums) {
        int m0 = 0;
        int m1 = 0;

        for (int i = 0; i < nums.length; i++) {
            int nm0 = Math.max(m0, m1);
            int nm1 = m0 + nums[i];
            m0 = nm0;
            m1 = nm1;
        }

        return Math.max(m0, m1);
    }

}
