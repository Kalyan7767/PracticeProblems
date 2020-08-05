package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SumTreeCheckerTest {

    SumTreeChecker sumTreeChecker = new SumTreeChecker();

    @Test
    public void isSumTree() {
        TreeNode root = new TreeNode(26);
        root.left = new TreeNode(10);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(3);
        Assert.assertTrue(sumTreeChecker.isSumTree(root));
    }
}