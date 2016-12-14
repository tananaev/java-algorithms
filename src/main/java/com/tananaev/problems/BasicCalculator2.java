package com.tananaev.problems;

public class BasicCalculator2 {

    public int calculateMulDiv(String s) {

        int result = 1;
        int last = 0;
        boolean multiply = true;

        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == '/' || s.charAt(i) == '*') {
                int number = Integer.parseInt(s.substring(last, i));
                if (multiply) {
                    result *= number;
                } else {
                    result /= number;
                }
                multiply = i < s.length() && s.charAt(i) == '*';
                last = i + 1;
            }
        }

        return result;
    }

    public int calculate(String s) {
        s = s.replace(" ", "");

        int result = 0;
        int last = 0;
        boolean sum = true;

        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == '-' || s.charAt(i) == '+') {
                int number = calculateMulDiv(s.substring(last, i));
                if (sum) {
                    result += number;
                } else {
                    result -= number;
                }
                sum = i < s.length() && s.charAt(i) == '+';
                last = i + 1;
            }
        }

        return result;
    }

}
