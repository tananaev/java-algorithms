package com.tananaev.problems;

public class CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        if (s.isEmpty()) return 0;
        int count = 0;
        int start = 0;
        int pivot = -1;
        for (int i = 0; i < s.length(); i++) {
            if (pivot < start && s.charAt(start) != s.charAt(i)) {
                pivot = i;
            } else if (pivot > start && s.charAt(start) == s.charAt(i)) {
                count += i - pivot;
                start = pivot;
                pivot = i;
            } else if (pivot > start && pivot - start == i - pivot) {
                count += i - pivot;
                start = pivot;
                pivot = -1;
            }
        }
        if (pivot > start) {
            count += s.length() - pivot;
        }
        return count;
    }

}
