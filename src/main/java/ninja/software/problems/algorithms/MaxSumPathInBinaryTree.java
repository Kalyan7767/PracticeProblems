package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;

public class MaxSumPathInBinaryTree {

    public int maxPathSum(TreeNode A) {
        Pair result = findMax(A);
        if(result == null) {
            return -1;
        }
        return result.currMax;
    }

    public Pair findMax(TreeNode A) {
        if(A == null) {
            return null;
        }
        if(A.left == null && A.right == null) {
            return new Pair(A.val, A.val);
        }

        Pair leftResult = findMax(A.left);
        Pair rightResult = findMax(A.right);
        Pair result = new Pair();

        if(leftResult == null) {
            result.runningMax = A.val + rightResult.runningMax;
            result.currMax = Math.max(result.runningMax, rightResult.currMax);
        } else if(rightResult == null) {
            result.runningMax = A.val + leftResult.runningMax;
            result.currMax = Math.max(result.runningMax, leftResult.currMax);
        } else {
            result.runningMax = Math.max(leftResult.runningMax, rightResult.runningMax) + A.val;
            result.currMax = Math.max(result.runningMax, leftResult.currMax);
            result.currMax = Math.max(result.currMax, rightResult.currMax);
            result.currMax = Math.max(result.currMax, leftResult.runningMax + rightResult.runningMax + A.val);
        }

        result.runningMax = Math.max(A.val, result.runningMax);
        result.currMax = Math.max(result.currMax,result.runningMax);
        return result;
    }

    class Pair {
        int currMax;
        int runningMax;

        public Pair() {
        }

        public Pair(int currMax, int runningMax) {
            this.currMax = currMax;
            this.runningMax = runningMax;
        }
    }

}
