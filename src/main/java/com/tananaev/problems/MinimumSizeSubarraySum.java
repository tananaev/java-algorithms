package com.tananaev.problems;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int from = 0, to = 0;

        int min = 0;

        while (from < nums.length && to < nums.length) {

            while (sum < s && to < nums.length) {
                sum += nums[to];
                to += 1;
            }

            while (from <= to) {
                if (sum - nums[from] >= s) {
                    sum -= nums[from];
                    from += 1;
                } else {
                    break;
                }
            }

            if (sum >= s) {
                min = min == 0 ? to - from : Math.min(min, to - from);
            }

            while (sum >= s && from <= to) {
                sum -= nums[from];
                from += 1;
            }
        }

        return min;
    }

}
