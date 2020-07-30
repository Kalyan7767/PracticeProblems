package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeToBinarySearchTreeConverterTest {

    BinaryTreeToBinarySearchTreeConverter converter = new BinaryTreeToBinarySearchTreeConverter();

    @Test
    public void convert() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(7);
        converter.convert(root);
        converter.printInOrder(root);
    }
}