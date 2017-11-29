package com.tananaev.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDnaSequences {

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> result = new HashSet<>();
        Set<String> all = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String ss = s.substring(i, i + 10);
            if (all.contains(ss)) {
                result.add(ss);
            } else {
                all.add(ss);
            }
        }
        return new ArrayList<>(result);
    }

}
