package me.qping.learning;


import me.qping.learning.util.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */



public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		/*
		 * 初始状态：
		 *  l1,l2都是非递减(递增)的链表
		 * 	p1,p2,p3分别指向l1,l2,l3的第一个节点
		 * 开始归并：
		 * 	当p1.val < p2.val时,使p3.next = p1,p3 = p1,p1 = p1.next
		 * 	否则 p3.next = p2, p3 = p2, p2 = p2.next
		 *  当p1或p2为空时，将剩余的链表赋给p3.next
		 * 结果：
		 * l1,l2合并为l3
		 * l3是非递减(递增)的链表
		 *
		 */
		ListNode p1 = l1;
		ListNode p2 = l2;
		ListNode l3 = new ListNode(0);
		ListNode p3 = l3;
		while(p1 != null && p2 != null){
			if(p1.val < p2.val){
				p3.next = p1;
				p3 = p1;
				p1 = p1.next;
			}else{
				p3.next = p2;
				p3 = p2;
				p2 = p3.next ;
			}
		}
		p3.next = (p1 != null ? p1 : p2);
		return l3.next;
	}

}

