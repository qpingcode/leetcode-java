package code;

import util.ListNode;

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
		 * ��ʼ״̬��
		 *  l1,l2���Ƿǵݼ�(����)������
		 * 	p1,p2,p3�ֱ�ָ��l1,l2,l3�ĵ�һ���ڵ�
		 * ��ʼ�鲢��
		 * 	��p1.val < p2.valʱ,ʹp3.next = p1,p3 = p1,p1 = p1.next
		 * 	���� p3.next = p2, p3 = p2, p2 = p2.next
		 *  ��p1��p2Ϊ��ʱ����ʣ���������p3.next
		 * �����
		 * l1,l2�ϲ�Ϊl3
		 * l3�Ƿǵݼ�(����)������
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

