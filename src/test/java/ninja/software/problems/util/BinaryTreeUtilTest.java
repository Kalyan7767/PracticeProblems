package ninja.software.problems.util;

import ninja.software.problems.model.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeUtilTest {


    @Test
    public void isCompleteBinaryTree() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(14);
        Assert.assertTrue(BinaryTreeUtil.isCompleteBinaryTree(root));

        root = new TreeNode(10);
        root.left = new TreeNode(12);
        Assert.assertTrue(BinaryTreeUtil.isCompleteBinaryTree(root));
        
    }

    @Test
    public void isNotCompleteBinaryTree() {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(14);
        root.left.right = new TreeNode(13);
        Assert.assertFalse(BinaryTreeUtil.isCompleteBinaryTree(root));

        root = new TreeNode(10);
        root.right = new TreeNode(14);
        Assert.assertFalse(BinaryTreeUtil.isCompleteBinaryTree(root));

        root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(14);
        root.left.left = new TreeNode(13);
        root.left.right = new TreeNode(15);
        root.right.right = new TreeNode(16);
        Assert.assertFalse(BinaryTreeUtil.isCompleteBinaryTree(root));

        root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(14);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(16);
        Assert.assertFalse(BinaryTreeUtil.isCompleteBinaryTree(root));

        root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(14);
        root.left.right = new TreeNode(17);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(16);
        Assert.assertFalse(BinaryTreeUtil.isCompleteBinaryTree(root));
    }
    @Test
    public void isCompleteBinaryTree2() {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(14);
        root.left.left = new TreeNode(13);
        root.left.right = new TreeNode(15);
        root.right.left = new TreeNode(16);
        Assert.assertTrue(BinaryTreeUtil.isCompleteBinaryTree(root));
    }
}