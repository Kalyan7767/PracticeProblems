package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;
import org.junit.Test;

public class BinaryTreeTest {

    BinaryTree tree = new BinaryTree();

    @Test
    public void invert() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        tree.printInorder(root);
        System.out.println("\n");
        tree.invert(root);
        tree.printInorder(root);
    }
}