package com.tananaev.problems;

public class CountingBits {

    public int[] countBits(int num) {
        int[] a = new int[num + 1];
        if (a.length > 0) a[0] = 0;
        if (a.length > 1) a[1] = 1;
        int pivot = 2;
        for (int i = 2; i < a.length; i++) {
            if (i >= pivot << 1) {
                pivot <<= 1;
            }
            a[i] = 1 + a[i - pivot];
        }
        return a;
    }

}
