package com.tananaev.problems;

public class SumRootToLeafNumbers {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public int sumNumbers(TreeNode node, int number) {
        number = number * 10 + node.val;
        if (node.left == null && node.right == null) {
            return number;
        } else {
            int total = 0;
            if (node.left != null) {
                total += sumNumbers(node.left, number);
            }
            if (node.right != null) {
                total += sumNumbers(node.right, number);
            }
            return total;
        }
    }

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return sumNumbers(root, 0);
        }
    }

}
