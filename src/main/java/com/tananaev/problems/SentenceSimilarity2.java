package com.tananaev.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SentenceSimilarity2 {

    public static class Node {
        public String word;
        public Set<Node> nodes = new HashSet<>();
    }

    public boolean find(Set<Node> checked, Node node, String word) {
        if (node.word.equals(word)) {
            return true;
        }
        for (Node peer : node.nodes) {
            if (!checked.contains(peer)) {
                checked.add(peer);
                if (find(checked, peer, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length) return false;
        Map<String, Node> nodeMap = new HashMap<>();
        for (String[] pair : pairs) {
            Node from = nodeMap.get(pair[0]);
            if (from == null) {
                from = new Node();
                from.word = pair[0];
                nodeMap.put(pair[0], from);
            }
            Node to = nodeMap.get(pair[1]);
            if (to == null) {
                to = new Node();
                to.word = pair[1];
                nodeMap.put(pair[1], to);
            }
            from.nodes.add(to);
            to.nodes.add(from);
        }
        for (int i = 0; i < words1.length; i++) {
            if (!words1[i].equals(words2[i])) {
                Node node = nodeMap.get(words1[i]);
                if (node == null || !find(new HashSet<>(), node, words2[i])) {
                    return false;
                }
            }
        }
        return true;
    }

}
