package com.tananaev.problems;

public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int from = i, to = i;
            for (int j = 0; j <= Math.min(from, s.length() - 1 - to); j++) {
                if (s.charAt(from - j) == s.charAt(to + j)) {
                    count += 1;
                } else {
                    break;
                }
            }

        }
        for (int i = 0; i < s.length() - 1; i++) {
            int from = i, to = i + 1;
            for (int j = 0; j <= Math.min(from, s.length() - 1 - to); j++) {
                if (s.charAt(from - j) == s.charAt(to + j)) {
                    count += 1;
                } else {
                    break;
                }
            }
        }
        return count;
    }

}
