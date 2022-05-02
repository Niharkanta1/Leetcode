package com.leetcode.solutions.two_pointers;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _167TwoSum2 {

	public int[] twoSum(int[] numbers, int target) {
		int l = 0, r = numbers.length - 1;
		while (l <= r) {
			int sum = numbers[l] + numbers[r];
			if (sum == target) {
				return new int[]{l + 1, r + 1};
			} else if (sum < target) {
				l++;
			} else if (sum > target) {
				r--;
			}
		}
		return new int[0];
	}
}
