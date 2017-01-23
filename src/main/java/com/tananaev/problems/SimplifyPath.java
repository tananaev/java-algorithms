package com.tananaev.problems;

import java.util.LinkedList;

public class SimplifyPath {

    public String simplifyPath(String path) {
        String[] items = path.split("/");
        LinkedList<String> stack = new LinkedList<>();
        for (String item : items) {
            if (item.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.removeLast();
                }
            } else if (!item.isEmpty() && !item.equals(".")) {
                stack.addLast(item);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        } else {
            StringBuilder result = new StringBuilder();
            for (String item : stack) {
                result.append("/").append(item);
            }
            return result.toString();
        }
    }

}
