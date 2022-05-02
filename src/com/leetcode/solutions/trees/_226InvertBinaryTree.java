package com.leetcode.solutions.trees;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _226InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;

		// Swap two children
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
}
