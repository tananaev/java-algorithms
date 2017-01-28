package com.tananaev.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class WordLadder2 {

    static class Item {
        String word;
        Item previous;
        int depth;
    }

    private boolean isSimpleTransformation(String w1, String w2) {
        int differences = 0;
        for (int i = 0; i < w1.length(); i++) {
            if (w1.charAt(i) != w2.charAt(i)) {
                differences += 1;
                if (differences > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new LinkedList<>();

        Map<String, Integer> wordDepth = new HashMap<>();
        for (String word : wordList) {
            wordDepth.put(word, Integer.MAX_VALUE);
        }

        Queue<Item> queue = new LinkedList<>();
        Item item = new Item();
        item.word = beginWord;
        item.depth = 1;
        queue.add(item);

        while (!queue.isEmpty()) {
            item = queue.remove();
            if (!result.isEmpty() && item.depth > result.iterator().next().size()) {
                break;
            }
            if (item.word.equals(endWord)) {
                LinkedList<String> path = new LinkedList<>();
                while (item != null) {
                    path.addFirst(item.word);
                    item = item.previous;
                }
                result.add(path);
                continue;
            }

            for (String word : wordList) {
                if (item.depth < wordDepth.get(word) && isSimpleTransformation(item.word, word)) {
                    Item next = new Item();
                    next.word = word;
                    next.previous = item;
                    next.depth = item.depth + 1;
                    queue.add(next);
                    wordDepth.put(word, next.depth);
                }
            }
        }

        return result;
    }

}
