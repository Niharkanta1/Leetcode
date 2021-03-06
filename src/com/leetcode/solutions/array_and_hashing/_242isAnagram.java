package com.leetcode.solutions.array_and_hashing;

import java.util.HashMap;
import java.util.Map;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _242isAnagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) return false;
		if (s.equals(t)) return true;

		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			map1.merge(s.charAt(i), 1, (oldValue, newValue) -> oldValue + newValue);
			map2.merge(t.charAt(i), 1, (oldValue, newValue) -> oldValue + newValue);
		}

		for (Character c : map1.keySet()) {
			if (!map1.get(c).equals(map2.get(c)))
				return false;
		}

		return true;
	}

	public boolean isAnagram2(String s, String t) {
		if (s.length() != t.length()) return false;
		if (s.equals(t)) return true;

		int[] charCount = new int[26];

		for(int i=0; i < s.length(); i++) {
			charCount[s.charAt(i)-'a']++;
			charCount[t.charAt(i)-'a']--;
		}

		for(int count : charCount) {
			if(count != 0) return false;
		}


		return true;
	}
}
