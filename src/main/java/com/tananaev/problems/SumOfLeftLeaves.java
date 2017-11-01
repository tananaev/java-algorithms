package com.tananaev.problems;

public class SumOfLeftLeaves {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int sumOfLeftLeaves(TreeNode root, boolean left) {
        if (root == null) {
            return 0;
        } else if (left && root.left == null && root.right == null) {
            return root.val;
        } else {
            return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

}
