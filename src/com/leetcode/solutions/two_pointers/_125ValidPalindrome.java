package com.leetcode.solutions.two_pointers;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _125ValidPalindrome {

	public static void main(String[] args) {
		var result = isPalindrome("A man, a plan, a canal: panama");
		System.out.println(result);
	}

	public static boolean isPalindrome(String s) {
		//s = s.toLowerCase(Locale.ROOT);
		var content = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i)) && s.charAt(i) != ' ') {
				content.append(s.charAt(i));
			}
		}

		/*for(int i = 0, j = content.length()-1; i <= j; i++, j--) {
			if(content.charAt(i) != content.charAt(j)) return false;
		}*/

		return content.toString().equalsIgnoreCase(content.reverse().toString());
	}
}
