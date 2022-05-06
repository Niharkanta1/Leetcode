package com.leetcode.solutions.trees;

/*
 * @created 04/05/2022
 * @project Leetcode
 * @author nihar
 */
public class _572SubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)
            return subRoot == null;

        return isSameTree(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
