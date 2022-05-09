package com.leetcode.solutions.array_and_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @created 09-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _49GroupAnagram {

	public static void main(String[] args) {
		System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> result = new HashMap<>();
		for(String s: strs) {
			char[] charHash = new char[26];
			for(int i=0; i< s.length(); i++) {
				charHash[s.charAt(i)-'a']++;
			}
			String hashString = new String(charHash);
			System.out.println(hashString);

			if(result.get(hashString) == null) {
				result.put(hashString, new ArrayList<>());
			}
			result.get(hashString).add(s);
		}
		return new ArrayList(result.values());
	}
}
