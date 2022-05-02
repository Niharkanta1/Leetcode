package com.leetcode.solutions.linked_list;

/*
 * @created 02-05-2022
 * @project Leetcode
 * @author Nihar
 */
public class _21MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode();
		ListNode prev = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				prev.next = list1;
				list1 = list1.next;
			} else {
				prev.next = list2;
				list2 = list2.next;
			}
			prev = prev.next;
		}

		if (list1 != null) {
			prev.next = list1;
		} else if (list2 != null) {
			prev.next = list2;
		}

		return dummy.next;
	}

	public ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
		ListNode head = new ListNode(0);

		if (list1 == null && list2 == null) return null;
		if (list1 == null) return list2;
		if (list2 == null) return list1;

		if (list1.val > list2.val) {
			head = list2;
			list2 = list2.next;
		} else {
			head = list1;
			list1 = list1.next;
		}
		head.next = mergeTwoLists(list1, list2);
		return head;
	}
}
