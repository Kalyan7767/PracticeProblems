package ninja.software.problems.algorithms;

import ninja.software.problems.model.Pair;
import ninja.software.problems.model.TreeNode;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MaxSumPathInBinaryTreeTest {

    MaxSumPathInBinaryTree maxSumPathInBinaryTree = new MaxSumPathInBinaryTree();

    @Test
    public void testMaxPathSum() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        Pair<Integer, Integer> result = maxSumPathInBinaryTree.findMax(root);
        Assert.assertThat(result.left, CoreMatchers.is(6));
    }

    @Test
    public void testMaxPathSumWithNegativeNodes() {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(-10);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(-10);
        root.right.right = new TreeNode(-50);
        Pair<Integer, Integer> result = maxSumPathInBinaryTree.findMax(root);
        Assert.assertThat(result.left, CoreMatchers.is(40));
    }

    @Test
    public void testMaxPathSumWithOnlyNegativeNodes() {
        TreeNode root = new TreeNode(-20);
        root.left = new TreeNode(-10);
        root.right = new TreeNode(-20);
        root.right.left = new TreeNode(-10);
        root.right.right = new TreeNode(-50);
        Pair<Integer, Integer> result = maxSumPathInBinaryTree.findMax(root);
        Assert.assertThat(result.left, CoreMatchers.is(-10));
    }

    @Test
    public void testMaxPathSumWithOnlyOnePositiveNodes() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(-10);
        root.right = new TreeNode(-20);
        root.right.left = new TreeNode(30);
        root.right.right = new TreeNode(-50);
        int result = maxSumPathInBinaryTree.maxPathSum(root);
        Assert.assertThat(result, CoreMatchers.is(30));
    }

    @Test
    public void testMaxPathSumWithOnlyOnePositiveNodeSubTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(-4);
        root.right.left.right = new TreeNode(7);
        int result = maxSumPathInBinaryTree.maxPathSum(root);
        Assert.assertThat(result, CoreMatchers.is(13));

        root = new TreeNode(-1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(-4);
        root.right.left.right = new TreeNode(7);
        result = maxSumPathInBinaryTree.maxPathSum(root);
        Assert.assertThat(result, CoreMatchers.is(7));

        root = new TreeNode(-1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(7);
        result = maxSumPathInBinaryTree.maxPathSum(root);
        Assert.assertThat(result, CoreMatchers.is(15));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(7);
        result = maxSumPathInBinaryTree.maxPathSum(root);
        Assert.assertThat(result, CoreMatchers.is(17));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(-4);
        root.right.left.right = new TreeNode(7);
        result = maxSumPathInBinaryTree.maxPathSum(root);
        Assert.assertThat(result, CoreMatchers.is(9));

        root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);
        result = maxSumPathInBinaryTree.maxPathSum(root);
        Assert.assertThat(result, CoreMatchers.is(48));

        root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        result = maxSumPathInBinaryTree.maxPathSum(root);
        Assert.assertThat(result, CoreMatchers.is(42));
    }
}