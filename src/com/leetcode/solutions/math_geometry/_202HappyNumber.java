package com.leetcode.solutions.math_geometry;


import java.util.HashSet;
import java.util.Set;

/*
 * @created 06/05/2022
 * @project Leetcode
 * @author nihar
 */
public class _202HappyNumber {
    public boolean isHappy(int n) {
        if(n == 1) return true;

        Set<Integer> visit = new HashSet<>();
        while(!visit.contains(n)) {
            visit.add(n);
            n = sumOfSquares(n);
            if(n == 1)
                return true;
        }

        return false;
    }

    private int sumOfSquares(int n) {
        int sum = 0;
        while(n != 0) {
            int digit = n % 10;
            sum = sum + (digit * digit);
            n = n/10;
        }
        return sum;
    }
}
