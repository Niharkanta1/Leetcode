package com.leetcode.solutions.dynamic_programming;


/*
 * @created 05/05/2022
 * @project Leetcode
 * @author nihar
 */
public class _746MinCostClimbing {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
    public static int minCostClimbingStairs(int[] cost) {
        for(int i = cost.length - 2; i >= 0; i--) {
            int firstStepCost = cost[i+1];
            int secondStepCost = i+2 > cost.length -1 ? 0 : cost[i+2];
            cost[i] = Math.min(cost[i] + firstStepCost, cost[i] + secondStepCost);
        }
        return Math.min(cost[0], cost[1]);
    }
}
