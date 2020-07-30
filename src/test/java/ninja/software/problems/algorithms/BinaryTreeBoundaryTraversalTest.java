package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeBoundaryTraversalTest {

    BinaryTreeBoundaryTraversal boundaryTraversal = new BinaryTreeBoundaryTraversal();

    @Test
    public void printBoundaryNodes() {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(12);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        root.right = new TreeNode(22);
        root.right.right = new TreeNode(25);
        root.right.left = new TreeNode(21);
        root.right.left.left = new TreeNode(17);
        root.right.left.right = new TreeNode(18);
        List<Integer> expecteds = new ArrayList<>();
        expecteds.add(20);
        expecteds.add(8);
        expecteds.add(4);
        expecteds.add(10);
        expecteds.add(14);
        expecteds.add(17);
        expecteds.add(18);
        expecteds.add(25);
        expecteds.add(22);
        ArrayList<Integer> actuals = boundaryTraversal.printBoundaryNodes(root);
        Assert.assertArrayEquals(expecteds.toArray(), actuals.toArray());
    }
}