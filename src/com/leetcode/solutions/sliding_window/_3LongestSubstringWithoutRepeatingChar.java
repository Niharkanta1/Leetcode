package com.leetcode.solutions.sliding_window;

import java.util.HashSet;
import java.util.Set;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _3LongestSubstringWithoutRepeatingChar {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int maxStr = 0;
		int i = 0, j = 0;
		Set<Character> charSet = new HashSet<>();
		while (j < s.length()) {
			if (!charSet.contains(s.charAt(j))) {
				charSet.add(s.charAt(j));
				j++;
			} else {
				charSet.remove(s.charAt(i));
				i++;
			}
			maxStr = Math.max(maxStr, j - i);
		}
		return maxStr;
	}
}
