package com.tananaev.problems;

public class NumberOfSegmentsInString {

    public int countSegments(String s) {
        int count = 0;
        int last = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (last >= 0 && i - last > 1) {
                    count += 1;
                }
                last = i;
            }
        }
        if (last >= 0) {
            count += 1;
        }
        return count;
    }

}
