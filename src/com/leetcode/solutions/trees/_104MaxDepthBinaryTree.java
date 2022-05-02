package com.leetcode.solutions.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _104MaxDepthBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	public int maxDepthBFS(TreeNode root) {
		if (root == null)
			return 0;

		int level = 1;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			for (TreeNode node : queue) {
				var tempNode = queue.poll();
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				} else if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
			}
			level++;
		}
		return level;
	}

	public int maxDepthDFS(TreeNode root) {
		int level = 1;
		int result = 0;
		class NodeAndLevel {
			TreeNode node;
			Integer level;

			NodeAndLevel(TreeNode tn, Integer lvl) {
				node = tn;
				level = lvl;
			}

		}
		;
		Stack<NodeAndLevel> stack = new Stack<>();
		stack.add(new NodeAndLevel(root, level));

		while (!stack.isEmpty()) {
			var object = stack.pop();
			if (object.node != null) {
				result = Math.max(result, object.level);
				stack.push(new NodeAndLevel(object.node.left, level + 1));
				stack.push(new NodeAndLevel(object.node.right, level + 1));
			}
		}

		return result;
	}
}
