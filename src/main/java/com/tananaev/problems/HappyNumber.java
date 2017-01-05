package com.tananaev.problems;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> history = new HashSet<>();

        while (n != 1) {
            if (history.contains(n)) {
                return false;
            }
            history.add(n);

            int next = 0;

            while (n != 0) {
                next += (n % 10) * (n % 10);
                n /= 10;
            }

            n = next;
        }

        return true;
    }

}
