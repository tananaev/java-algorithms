package com.tananaev.problems;

public class SubtreeOfAnotherTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private boolean compareTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if (s == null || t == null) {
            return false;
        } else {
            if (s.val != t.val) {
                return false;
            } else {
                return compareTree(s.left, t.left) && compareTree(s.right, t.right);
            }
        }
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        } else if (s.val == t.val && compareTree(s, t)) {
            return true;
        } else {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }

}
