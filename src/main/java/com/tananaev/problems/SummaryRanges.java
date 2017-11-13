package com.tananaev.problems;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        int from = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                if (i - from > 1) {
                    result.add(String.format("%d->%d", nums[from], nums[i - 1]));
                } else {
                    result.add(String.format("%d", nums[from]));
                }
                from = i;
            }
        }
        if (nums.length > from) {
            if (nums.length - from > 1) {
                result.add(String.format("%d->%d", nums[from], nums[nums.length - 1]));
            } else {
                result.add(String.format("%d", nums[from]));
            }
        }
        return result;
    }

}
