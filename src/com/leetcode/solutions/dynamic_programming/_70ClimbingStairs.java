package com.leetcode.solutions.dynamic_programming;


/*
 * @created 05/05/2022
 * @project Leetcode
 * @author nihar
 */
public class _70ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
    public static int climbStairs(int n) {
        int oneStep = 1;
        int twoStep = 1;
        for(int i = 0; i < n-1; i++) {
            int temp = oneStep;
            oneStep = oneStep + twoStep;
            twoStep = temp;
        }
        return oneStep;
    }
}
