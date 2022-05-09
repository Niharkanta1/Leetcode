package com.leetcode.solutions.trees;


/*
 * @created 04/05/2022
 * @project Leetcode
 * @author nihar
 */
public class _235LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;

        while (current != null) {
            if(p.val > current.val && q.val > current.val) {
                current = current.right;
            } else if(p.val < current.val && q.val < current.val) {
                current = current.left;
            } else {
                return current;
            }
        }
        return null;
    }
}
