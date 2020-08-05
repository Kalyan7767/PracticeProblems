package ninja.software.problems.algorithms;

import ninja.software.problems.model.Pair;
import ninja.software.problems.model.TreeNode;

public class SumTreeChecker {

    public boolean isSumTree(TreeNode node) {
        return validate(node).right;
    }

    private Pair<Integer, Boolean> validate(TreeNode node) {
        if(node == null) {
            return new Pair(0, true);
        }
        if(node.left == null && node.right == null) {
            return new Pair<>(node.val, true);
        }

        Pair<Integer, Boolean> leftSubTree = validate(node.left);
        Pair<Integer, Boolean> rightSubTree = validate(node.right);

        if(!leftSubTree.right || !rightSubTree.right) {
            return new Pair<>(-1, false);
        }

        return new Pair<>(node.val + leftSubTree.left + rightSubTree.left,
                node.val == leftSubTree.left + rightSubTree.left);

    }
}
