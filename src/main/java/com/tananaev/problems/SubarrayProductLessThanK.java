package com.tananaev.problems;

public class SubarrayProductLessThanK {

    public int combinations(long length) {
        return (int)(length * (length + 1) / 2);
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int beginIndex = 0;
        int endIndex = 0;
        int lastIndex = 0;
        int product = 1;
        while (beginIndex < nums.length && endIndex < nums.length) {
            if (beginIndex > endIndex) {
                endIndex = beginIndex;
            }
            while (endIndex < nums.length && product * nums[endIndex] < k) {
                product *= nums[endIndex];
                endIndex += 1;
            }
            if (lastIndex > beginIndex) {
                count += (lastIndex - beginIndex) * (endIndex - lastIndex);
                count += combinations(endIndex - lastIndex);
            } else {
                count += combinations(endIndex - beginIndex);
            }
            lastIndex = endIndex;
            while (beginIndex <= endIndex && endIndex < nums.length && product * nums[endIndex] >= k) {
                product /= nums[beginIndex];
                beginIndex += 1;
            }
        }
        return count;
    }

}
