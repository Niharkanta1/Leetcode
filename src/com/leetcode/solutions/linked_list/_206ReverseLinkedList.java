package com.leetcode.solutions.linked_list;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _206ReverseLinkedList {

	// Time O(n), Memory O(n)
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;

		while (current != null) {
			ListNode temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		return prev;
	}

	public ListNode reverseListRecursive(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode newHead = head;
		if (head.next != null) {
			newHead = reverseListRecursive(head.next);
			head.next.next = head;
		}
		head.next = null;
		return newHead;
	}
}
