package com.leetcode.solutions;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _121BestTimeToBuyAndSell {
	public int maxProfit(int[] prices) {
		int maxProfit = 0, profit = 0;
		int i = 0;
		int j = i +1;
		while(j < prices.length) {
			if(prices[i] < prices[j]) {
				profit = prices[j] - prices[i];
				maxProfit = Math.max(maxProfit, profit);
			}
			else {
				i = j;
			}
			j++;
		}

		return maxProfit;
	}
}
