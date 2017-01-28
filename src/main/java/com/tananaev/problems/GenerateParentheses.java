package com.tananaev.problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public void generateParenthesis(int n, int counter, List<String> results, StringBuilder current) {
        if (counter >= 0 && counter <= n) {
            if (current.length() == n * 2) {
                if (counter == 0) {
                    results.add(current.toString());
                }
            } else {
                current.append("(");
                generateParenthesis(n, counter + 1, results, current);
                current.deleteCharAt(current.length() - 1);
                current.append(")");
                generateParenthesis(n, counter - 1, results, current);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        generateParenthesis(n, 0, results, new StringBuilder());
        return results;
    }

}
