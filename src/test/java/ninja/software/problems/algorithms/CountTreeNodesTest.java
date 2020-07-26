package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountTreeNodesTest {

    CountTreeNodes countTreeNodes = new CountTreeNodes();

    @Test
    public void count() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int result = countTreeNodes.count(root);
        Assert.assertThat(result, CoreMatchers.is(3));
    }

    @Test
    public void count2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int result = countTreeNodes.count(root);
        Assert.assertThat(result, CoreMatchers.is(5));
    }
}