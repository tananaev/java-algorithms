package com.tananaev.problems;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int si = 0;
        int ti = 0;
        while (si < s.length() && ti < t.length()) {
            if (s.charAt(si) == t.charAt(ti)) {
                si += 1;
            }
            ti += 1;
        }
        return si == s.length();
    }

}
