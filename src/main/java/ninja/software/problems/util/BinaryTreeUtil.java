package ninja.software.problems.util;

import ninja.software.problems.model.TreeNode;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BinaryTreeUtil {

    public static boolean isCompleteBinaryTree(TreeNode node) {
        Queue<TreeNode> levelOrderQueue = new ArrayBlockingQueue<>(10);
        if(node == null) {
            return true;
        }
        boolean isFirstInCompleteNodeFound = false;
        levelOrderQueue.add(node);
        while(!levelOrderQueue.isEmpty()) {
            if(isFirstInCompleteNodeFound) {
                return levelOrderQueue.stream().allMatch(currentNode -> currentNode.left == null && currentNode.right == null);
            }
            TreeNode temp = levelOrderQueue.poll();
            if(temp.left == null && temp.right == null) {
                isFirstInCompleteNodeFound = true;
            }
            if(temp.left == null && temp.right != null) {
                return false;
            }
            if(temp.left != null && temp.right == null) {
                levelOrderQueue.add(temp.left);
                isFirstInCompleteNodeFound = true;
            } else if (temp.left != null) {
                levelOrderQueue.add(temp.left);
                levelOrderQueue.add(temp.right);
            }
        }
        return true;
    }
}
