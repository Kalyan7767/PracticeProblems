package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeToBinarySearchTreeConverter {
    public List<Integer> inOrderList = new ArrayList<>();

    public void convert(TreeNode node) {
        recordInorder(node);
        Collections.sort(inOrderList);
        reWriteNodes(node, 0);
    }

    public void recordInorder(TreeNode node) {
        if(node == null) {
            return;
        }
        recordInorder(node.left);
        inOrderList.add(node.val);
        recordInorder(node.right);
    }

    public void reWriteNodes(TreeNode node, int index) {
        if(node == null) {
            return;
        }
        reWriteNodes(node.left, index);
        node.val = inOrderList.get(index++);
        reWriteNodes(node.right, index);
    }

    public void printInOrder(TreeNode node) {
        if(node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print("-> "+ node.val);
        printInOrder(node.right);
    }
}
