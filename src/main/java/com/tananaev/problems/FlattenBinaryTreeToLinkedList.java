package com.tananaev.problems;

public class FlattenBinaryTreeToLinkedList {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public void flatten(TreeNode root) {
        if (root != null) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            flatten(left);
            flatten(right);
            root.left = null;
            root.right = left;
            TreeNode end = root;
            while (end.right != null) {
                end = end.right;
            }
            end.right = right;
        }
    }

}
