package com.tananaev.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CourseSchedule {

    class Node {
        int val;
        List<Node> reqs = new ArrayList<>();
    }

    boolean checkNode(Node node, Set<Integer> used) {
        if (node == null) {
            return true;
        }
        if (used.contains(node.val)) {
            return false;
        }
        used.add(node.val);
        for (Node r : node.reqs) {
            if (!checkNode(r, used)) {
                return false;
            }
        }
        used.remove(node.val);
        return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Node> nodes = new HashMap<>();
        Set<Integer> terminal = new HashSet<>();
        for (int[] req : prerequisites) {
            Node child = nodes.get(req[0]);
            if (child == null) {
                child = new Node();
                child.val = req[0];
                nodes.put(req[0], child);
                terminal.add(req[0]);
            }
            Node parent = nodes.get(req[1]);
            if (parent == null) {
                parent = new Node();
                parent.val = req[1];
                nodes.put(req[1], parent);
            }
            child.reqs.add(parent);
        }

        for (int i : terminal) {
            if (!checkNode(nodes.get(i), new HashSet<>())) {
                return false;
            }
        }

        return true;
    }

}
