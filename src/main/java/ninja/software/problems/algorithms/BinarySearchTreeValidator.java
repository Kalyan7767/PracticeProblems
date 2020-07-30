package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeValidator {

    private List<Integer> inOrderList = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        recordInorder(root);
        return isListSorted(inOrderList);
    }

    public void recordInorder(TreeNode node) {
        if(node == null) {
            return;
        }
        recordInorder(node.left);
        inOrderList.add(node.val);
        recordInorder(node.right);
    }

    public boolean isListSorted(List<Integer> list) {
        if(list == null || list.isEmpty()) {
            return false;
        }
        int prev = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            Integer value = list.get(i);
            if(value <= prev) {
                return false;
            }
            prev = value;
        }
        return true;
    }
}
