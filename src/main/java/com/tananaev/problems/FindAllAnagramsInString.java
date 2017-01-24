package com.tananaev.problems;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) {
            return result;
        }

        int index;
        int filled = 0;
        int[] stats = new int[27];

        for (int i = 0; i < p.length(); i++) {
            index = p.charAt(i) - 'a';
            if (stats[index] == 0) filled += 1;
            stats[index] += 1;
        }

        for (int i = 0; i < s.length(); i++) {

            index = s.charAt(i) - 'a';
            if (stats[index] == 0) filled += 1;
            stats[index] -= 1;
            if (stats[index] == 0) filled -= 1;

            if (i > p.length() - 1) {

                index = s.charAt(i - p.length()) - 'a';
                if (stats[index] == 0) filled += 1;
                stats[index] += 1;
                if (stats[index] == 0) filled -= 1;

            }

            if (i >= p.length() - 1 && filled == 0) {
                result.add(i - p.length() + 1);
            }

        }

        return result;
    }

}
