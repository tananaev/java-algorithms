package com.tananaev.problems;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int x = 0; x < 9; x++) {
            Set<Character> used = new HashSet<>();
            for (int y = 0; y < 9; y++) {
                char c = board[x][y];
                if (c != '.' && used.contains(c)) {
                    return false;
                }
                used.add(c);
            }
        }

        for (int y = 0; y < 9; y++) {
            Set<Character> used = new HashSet<>();
            for (int x = 0; x < 9; x++) {
                char c = board[x][y];
                if (c != '.' && used.contains(c)) {
                    return false;
                }
                used.add(c);
            }
        }

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                Set<Character> used = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[x * 3 + i][y * 3 + j];
                        if (c != '.' && used.contains(c)) {
                            return false;
                        }
                        used.add(c);
                    }
                }
            }
        }

        return true;
    }

}
