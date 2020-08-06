package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;

public class BinaryTreeInverter {

    public void invert(TreeNode node) {
        if(node == null) {
            return;
        }
        invert(node.left);
        invert(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    public void printInorder(TreeNode node) {
        if(node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print("->"+node.val);
        printInorder(node.right);
    }
}
