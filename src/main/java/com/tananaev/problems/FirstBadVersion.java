package com.tananaev.problems;

public class FirstBadVersion {

    public boolean isBadVersion(int version) {
        return version >= 1702766719;
    }

    public int firstBadVersion(boolean unknown, int good, int bad) {
        if (bad - good <= 1) {
            if (unknown && isBadVersion(good)) {
                return good;
            } else {
                return bad;
            }
        } else {
            int middle = (int) (((long) bad + (long) good) / 2);
            if (isBadVersion(middle)) {
                return firstBadVersion(unknown, good, middle);
            } else {
                return firstBadVersion(false, middle, bad);
            }
        }
    }

    public int firstBadVersion(int n) {
        return firstBadVersion(true, 1, n);
    }

}
