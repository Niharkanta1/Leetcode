package com.leetcode.solutions.math_geometry;


/*
 * @created 06/05/2022
 * @project Leetcode
 * @author nihar
 */
public class _66PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int sum = 0;
        for(int i = digits.length-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] new_digits = new int[digits.length+1];
        new_digits[0] = 1;
        return new_digits;
    }
}
