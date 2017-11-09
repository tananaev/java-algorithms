package com.tananaev.problems;

public class BinaryTreeTilt {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private static class Result {
        int tilt;
        int tiltSum;
        int nodeSum;
    }

    public Result findTiltInternal(TreeNode root) {
        Result result = new Result();
        if (root != null) {
            Result rl = findTiltInternal(root.left);
            Result rr = findTiltInternal(root.right);
            result.tilt = Math.abs(rl.nodeSum - rr.nodeSum);
            result.tiltSum = rl.tiltSum + result.tilt + rr.tiltSum;
            result.nodeSum = rl.nodeSum + root.val + rr.nodeSum;
        }
        return result;
    }

    public int findTilt(TreeNode root) {
        return findTiltInternal(root).tiltSum;
    }

}
