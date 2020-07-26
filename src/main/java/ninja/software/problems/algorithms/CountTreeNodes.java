package ninja.software.problems.algorithms;

import ninja.software.problems.model.TreeNode;

public class CountTreeNodes {

    public int count(TreeNode A) {
        if(A == null) {
            return 0;
        }
        return 1 + count(A.left) + count(A.right);
    }
}
