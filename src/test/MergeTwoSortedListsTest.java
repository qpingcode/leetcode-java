package test;

import code.MergeTwoSortedLists;
import util.ListNode;
import junit.framework.TestCase;

public class MergeTwoSortedListsTest extends TestCase {

	public void testMergeTwoLists() {
		
		MergeTwoSortedLists method = new MergeTwoSortedLists();
		
		ListNode a1 = getNode1();	//1 3 5 7 9
		ListNode a2 = getNode2();	//2 4 5 8
		ListNode a3 = method.mergeTwoLists(a1, a2);
		
		//check number
		int len3 = getListNodeNumber(a3);
		
		System.out.format("length:%d\n", len3);
		assertEquals(len3, 9);
		
		//check sort
		boolean flag = true;
		while(a3.next != null){
			System.out.print(a3.val + " ");
			if(a3.val > a3.next.val){
				flag = false;
				break;
			}
			a3 = a3.next;
		}
		
		assertEquals(true,flag);
	}

	private int getListNodeNumber(ListNode a1) {
		ListNode p1 = new ListNode(0);
		p1.next = a1;
		int len = 0;
		while(p1.next != null){
			len++;
			p1 = p1.next;
		}
		return len;
	}

	private ListNode getNode2() {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(3);
		ListNode a3 = new ListNode(5);
		ListNode a4 = new ListNode(7);
		ListNode a5 = new ListNode(9);
		
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		return a1;
	}

	private ListNode getNode1() {
		ListNode a1 = new ListNode(2);
		ListNode a2 = new ListNode(4);
		ListNode a3 = new ListNode(5);
		ListNode a4 = new ListNode(8);
		
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		return a1;
	}

}
