package com.tananaev.problems;

public class FindMinimumInRotatedSortedArray2 {

    public int findPivot(int[] nums, int from, int to) {
        if (to - from < 2) {
            return nums[from] < nums[to] ? from : to;
        }
        int middle = (from + to) / 2;
        if (nums[from] > nums[middle]) {
            return findPivot(nums, from, middle);
        } else if (nums[middle] > nums[to]) {
            return findPivot(nums, middle, to);
        } else {
            if (nums[from] < nums[middle] && nums[middle] == nums[to]) {
                return from;
            } else if (nums[from] == nums[middle] && nums[middle] < nums[to]) {
                return middle;
            } else {
                int left = findPivot(nums, from, middle);
                int right = findPivot(nums, middle, to);
                return nums[left] < nums[right] ? left : right;
            }
        }
    }

    public int findMin(int[] nums) {
        return nums.length > 0 ? nums[findPivot(nums, 0, nums.length - 1)] : -1;
    }

}
