package com.leetcode.solutions.trees;

/*
 * @created 03-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _110BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if(root == null)
			return true;

		return Math.abs(calculateHeight(root.left) - calculateHeight(root.right)) <= 1
				&& isBalanced(root.left) && isBalanced(root.right);
	}

	public int calculateHeight(TreeNode node) {
		if(node == null)
			return 0;

		int leftHeight = calculateHeight(node.left);
		int rightHeight = calculateHeight(node.right);

		return 1 + Math.max(leftHeight, rightHeight);
	}
}
