package com.leetcode.solutions.heap_and_priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * @created 03-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _703KthLargest {

	public static void main(String[] args) {
		_703KthLargest kthLargest = new _703KthLargest(3, new int[]{4, 5, 8, 2});
		kthLargest.add(3);   // return 4
		kthLargest.add(5);   // return 5
		kthLargest.add(10);  // return 5
		kthLargest.add(9);   // return 8
		kthLargest.add(4);   // return 8
	}

	static int k;
	static PriorityQueue<Integer> minHeap =  new PriorityQueue<>((a,b) -> a - b);
	public _703KthLargest(int k, int[] nums) {
		this.k = k;
		for(int num :nums) {
			minHeap.add(num);
		}
		System.out.println(minHeap);

		while(minHeap.size() > k) {
			System.out.println("Poll " + minHeap.poll());
		}
		System.out.println(minHeap);
	}

	public static int add(int val) {
		minHeap.add(val);
		if(minHeap.size() > k) {
			System.out.println("Poll " + minHeap.poll());
		}
		System.out.println(minHeap.peek());
		System.out.println(minHeap);
		return minHeap.peek();
	}
}
