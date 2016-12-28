package com.tananaev.problems;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum3 {

    public void combinationSum3(int k, int n, List<List<Integer>> result, LinkedList<Integer> list, int from, int to) {
        if (k == 0 && n == 0) {
            result.add(new LinkedList<>(list));
        } else if (k > 0 && n > 0) {
            for (int i = from; i <= to; i++) {
                list.addLast(i);
                combinationSum3(k - 1, n - i, result, list, i + 1, to);
                list.removeLast();
            }
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList<>();
        combinationSum3(k, n, result, new LinkedList<>(), 1, 9);
        return result;
    }

}
