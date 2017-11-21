package com.tananaev.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapping = new HashMap<>();
        Set<Character> used = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character replacement = mapping.get(s.charAt(i));
            if (replacement != null) {
                if (replacement != t.charAt(i)) {
                    return false;
                }
            } else {
                if (used.contains(t.charAt(i))) {
                    return false;
                }
                mapping.put(s.charAt(i), t.charAt(i));
                used.add(t.charAt(i));
            }
        }
        return true;
    }

}
