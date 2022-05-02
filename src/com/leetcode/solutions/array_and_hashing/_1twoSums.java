package com.leetcode.solutions.array_and_hashing;

import java.util.HashMap;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _1twoSums {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				sum = nums[i] + nums[j];
				if (sum == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}

		return result;
	}

	public int[] twoSumBetter(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				return new int[]{map.get(nums[i]), i};

			map.put(target - nums[i], i);
		}

		return new int[0];
	}
}
