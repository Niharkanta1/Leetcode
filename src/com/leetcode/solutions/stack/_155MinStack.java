package com.leetcode.solutions.stack;

import java.util.Stack;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _155MinStack {

	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public _155MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);
		if (minStack.isEmpty() || val <= minStack.peek()) {
			minStack.push(val);
		}
	}

	public void pop() {
		if (stack.peek().equals(minStack.peek())) {
			minStack.pop();
		}
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
