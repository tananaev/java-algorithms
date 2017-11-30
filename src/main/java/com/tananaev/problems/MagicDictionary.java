package com.tananaev.problems;

import java.util.HashSet;
import java.util.Set;

public class MagicDictionary {

    private Set<String> data = new HashSet<>();

    /** Initialize your data structure here. */
    public MagicDictionary() {
    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for (String s : dict) {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < s.length(); i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c != s.charAt(i)) {
                        sb.setCharAt(i, c);
                        data.add(sb.toString());
                    }
                }
                sb.setCharAt(i, s.charAt(i));
            }
        }
    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        return data.contains(word);
    }

}
