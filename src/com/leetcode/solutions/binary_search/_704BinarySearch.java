package com.leetcode.solutions.binary_search;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _704BinarySearch {

	public static void main(String[] args) {
		System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 10));
	}

	// Similar to - Search in a Sorted Array of Unknown Size
	// O(log n) runtime complexity.
	public static int search(int[] nums, int target) {
		int i = 0;
		int j = nums.length - 1;
		while (i <= j) {
			//int n = i + ((j-i)/2);
			int m = (i + j) / 2;
			if (target < nums[m]) {
				j = m - 1;
			} else if (target > nums[m]) {
				i = m + 1;
			} else {
				return m;
			}
		}
		return -1;
	}

}
