package com.leetcode.solutions.heap_and_priorityqueue;

import java.util.PriorityQueue;

/*
 * @created 03-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _1046LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a);
		for(int stone: stones) {
			maxHeap.add(stone);
		}
		System.out.println(maxHeap);
		while (maxHeap.size()> 1) {
			int stone1 = maxHeap.poll(); // 1st largest
			int stone2 = maxHeap.poll(); // 2nd largest

			if(stone1 != stone2) {
				maxHeap.add(stone1-stone2);
			}
		}
		return maxHeap.size()==0? 0: maxHeap.peek();
	}
}
