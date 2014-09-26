package test;

import util.ListNode;
import code.SortList;
import junit.framework.TestCase;

public class SortListTest extends TestCase {

	public void testSortList() {
		SortList sl = new SortList();
		ListNode nodes_1 = getListNode_1();
		ListNode nodes_1_after = sl.sortList(nodes_1);
		boolean flag = true;
		while(nodes_1_after.next != null){
			System.out.print(nodes_1_after.val + " ");
			if(nodes_1_after.val > nodes_1_after.next.val){
				flag = false;
				break;
			}
			nodes_1_after = nodes_1_after.next;
		}
		assertEquals(true,flag);
	}

	private ListNode getListNode_1() {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(3);
		ListNode a3 = new ListNode(9);
		ListNode a4 = new ListNode(4);
		ListNode a5 = new ListNode(5);
		
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		return a1;
	}
	
	

}
