package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;

import java.util.ArrayList;

public class BinaryTreeBoundaryTraversal {

    private ArrayList<Integer> boundaryValues = new ArrayList<>();

    public ArrayList<Integer> printBoundaryNodes(TreeNode node) {
        if(node == null) {
            return null;
        }
        boundaryValues.add(node.val);
        addLeftBoundary(node.left, true);
        addRightBoundary(node.right, true);

        return boundaryValues;
    }

    private void addRightBoundary(TreeNode node, boolean isBoundary) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            boundaryValues.add(node.val);
            return;
        }
        addRightBoundary(node.left, isBoundary && node.right == null);
        addRightBoundary(node.right, isBoundary);
        if(isBoundary) {
            boundaryValues.add(node.val);
        }
    }

    private void addLeftBoundary(TreeNode node, boolean isBoundary) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            boundaryValues.add(node.val);
            return;
        }
        if(isBoundary) {
            boundaryValues.add(node.val);
        }
        addLeftBoundary(node.left, isBoundary);
        addLeftBoundary(node.right, isBoundary && node.left == null);
    }

}
