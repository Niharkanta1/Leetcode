package com.leetcode.solutions.trees;

/*
 * @created 03-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _543DiameterOfBinaryTree {
	int maxDiameter = 0;
	public int diameterOfBinaryTree(TreeNode root) {
		CalculateHeight(root);
		return maxDiameter;
	}

	private int CalculateHeight(TreeNode root) {
		if(root == null)
			return -1; // Null tree node

		int LeftTreeHeight = CalculateHeight(root.left);
		int RightTreeHeight = CalculateHeight(root.right);

		// Diameter is calculated using the extension for both left and right tree so +2
		maxDiameter = Math.max(maxDiameter, LeftTreeHeight + RightTreeHeight + 2);
		return 1 + Math.max(LeftTreeHeight, RightTreeHeight); // +1 for the current Node
	}

}
