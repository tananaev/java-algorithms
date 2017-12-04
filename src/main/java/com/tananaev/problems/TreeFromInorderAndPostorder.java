package com.tananaev.problems;

public class TreeFromInorderAndPostorder {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] inorder, int is, int ie, int[] postorder, int ps, int pe) {
        if (ie - is <= 0) return null;
        TreeNode root = new TreeNode(postorder[pe - 1]);
        int i = is;
        while (inorder[i] != root.val) i += 1;
        root.left = buildTree(inorder, is, i, postorder, ps, ps + i - is);
        root.right = buildTree(inorder, i + 1, ie, postorder, ps + i - is, pe - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

}
