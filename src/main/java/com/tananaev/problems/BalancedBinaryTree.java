package com.tananaev.problems;

public class BalancedBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = height(root.left);
            int right = height(root.right);
            if (left < 0 || right < 0 || Math.abs(left - right) > 1) {
                return -1;
            } else {
                return 1 + Math.max(left, right);
            }
        }
    }

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

}
