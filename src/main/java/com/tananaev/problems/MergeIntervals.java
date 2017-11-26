package com.tananaev.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }

        @Override
        public int hashCode() {
            return Integer.hashCode(start) + Integer.hashCode(end);
        }

        @Override
        public boolean equals(Object obj) {
            Interval other = (Interval) obj;
            return start == other.start && end == other.end;
        }

        @Override
        public String toString() {
            return "(" + start + "," + end + ")";
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort((o1, o2) -> {
            if (o1.start == o2.start) return o1.end - o2.end;
            else return o1.start - o2.start;
        });

        List<Interval> result = new ArrayList<>();

        if (!intervals.isEmpty()) {
            Interval first = intervals.iterator().next();

            int start = first.start;
            int end = first.end;

            for (Interval interval : intervals) {
                if (interval.start <= end) {
                    end = Math.max(end, interval.end);
                } else {
                    result.add(new Interval(start, end));
                    start = interval.start;
                    end = interval.end;
                }
            }

            result.add(new Interval(start, end));
        }

        return result;
    }

}
