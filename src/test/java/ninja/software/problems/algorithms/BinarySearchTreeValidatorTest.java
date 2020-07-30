package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeValidatorTest {
    BinarySearchTreeValidator validator = new BinarySearchTreeValidator();

    @Test
    public void isValidBST() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        Assert.assertTrue(validator.isValidBST(root));
    }

    @Test
    public void isNotValidBST() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        Assert.assertFalse(validator.isValidBST(root));
    }

    @Test
    public void isValidBST2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        Assert.assertFalse(validator.isValidBST(root));
    }
}