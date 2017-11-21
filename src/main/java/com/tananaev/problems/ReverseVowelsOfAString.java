package com.tananaev.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfAString {

    private static Set<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder(s);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (!vowels.contains(s.charAt(left)) && left < right) left++;
            while (!vowels.contains(s.charAt(right)) && left < right) right--;
            if (left < right) {
                result.setCharAt(left, s.charAt(right));
                result.setCharAt(right, s.charAt(left));
                left++;
                right--;
            }
        }
        return result.toString();
    }

}
