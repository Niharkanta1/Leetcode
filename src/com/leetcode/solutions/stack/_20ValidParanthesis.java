package com.leetcode.solutions.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _20ValidParanthesis {

	public static void main(String[] args) {
		System.out.println(isValid("{[[()]]}()"));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');

		for (Character c : s.toCharArray()) {
			if (map.containsKey(c)) {
				if (!stack.empty() && stack.peek() == map.get(c)) {
					stack.pop();
				} else {
					return false; // invalid bracket
				}
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
}
