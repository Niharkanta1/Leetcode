package com.leetcode.solutions.array_and_hashing;

import java.util.HashSet;
import java.util.Set;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _217ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> numbers = new HashSet<Integer>();
		for (int num : nums) {
			if (!numbers.add(num)) {
				return true;
			}
		}
		return false;
	}
}
