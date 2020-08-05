package ninja.software.problems.algorithms;

import ninja.software.problems.model.Pair;
import ninja.software.problems.model.TreeNode;

public class MaxSumPathInBinaryTree {

    public int maxPathSum(TreeNode A) {
        Pair<Integer, Integer> result = findMax(A);
        if(result == null) {
            return -1;
        }
        return result.left;
    }

    public Pair<Integer, Integer> findMax(TreeNode A) {
        if(A == null) {
            return null;
        }
        if(A.left == null && A.right == null) {
            return new Pair<>(A.val, A.val);
        }

        Pair<Integer, Integer> leftResult = findMax(A.left);
        Pair<Integer, Integer> rightResult = findMax(A.right);
        Pair<Integer, Integer> result = new Pair<>();

        if(leftResult == null) {
            result.right = A.val + rightResult.right;
            result.left = Math.max(result.right, rightResult.left);
        } else if(rightResult == null) {
            result.right = A.val + leftResult.right;
            result.left = Math.max(result.right, leftResult.left);
        } else {
            result.right = Math.max(leftResult.right, rightResult.right) + A.val;
            result.left = Math.max(result.right, leftResult.left);
            result.left = Math.max(result.left, rightResult.left);
            result.left = Math.max(result.left, leftResult.right + rightResult.right + A.val);
        }

        result.right = Math.max(A.val, result.right);
        result.left = Math.max(result.left,result.right);
        return result;
    }
}
