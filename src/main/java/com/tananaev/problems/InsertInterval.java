package com.tananaev.problems;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }

        @Override
        public int hashCode() {
            return toString().hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return toString().equals(obj.toString());
        }

        @Override
        public String toString() {
            return String.format("(%d,%d)", start, end);
        }
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();

        boolean start = false, end = false;

        for (Interval interval : intervals) {
            if ((newInterval.start >= interval.start && newInterval.start <= interval.end) ||
                (newInterval.end >= interval.start && newInterval.end <= interval.end) ||
                (newInterval.start < interval.start && newInterval.end > interval.end)) {
                newInterval.start = Math.min(newInterval.start, interval.start);
                newInterval.end = Math.max(newInterval.end, interval.end);
            } else {
                if ((!start || !end) && newInterval.end < interval.start) {
                    result.add(newInterval);
                    start = true;
                    end = true;
                }
                result.add(interval);
            }
        }

        if (!start || !end) {
            result.add(newInterval);
        }

        return result;
    }

}
