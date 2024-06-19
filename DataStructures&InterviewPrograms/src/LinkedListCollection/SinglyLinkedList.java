package LinkedListCollection;
import java.util.*;

public class SinglyLinkedList {

	private ListNode head;
	private static class ListNode {
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void printLinkedList() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public void findLength() {
		int count=0;
		ListNode current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		System.out.println("Length of linked list is: "+count);
	}
	public void insertAtBegining(int data) {
		ListNode newNode=new ListNode(data);
		newNode.next=head;
		head=newNode;
		printLinkedList();
	}
	public void insertAtEnd(int data) {
		ListNode newNode=new ListNode(data);
		if(head==null) {
			head=newNode;
		}
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
		printLinkedList();		
	}
	public void insertNodeAt(int data, int position) {
		ListNode newNode=new ListNode(data);
		if(position==1) {
			newNode.next=head;
			head=newNode;
		}else {
			int count =1;
			ListNode previous=head;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=newNode;
			newNode.next=current;
			printLinkedList();
		}
	}
	public void deleteNodeAtFirst() {
		ListNode current=head;
		ListNode nextNode=current.next;
		current.next=null;
		head=nextNode;
		printLinkedList();
	}
	public void deleteNodeAtLast() {
		ListNode current=head;
		ListNode previous=null;
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		previous.next=null;
		printLinkedList();	
		
	}
	public void deleteNodeAt(int position) {
			int count =1;
			ListNode previous=head;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			ListNode nextNode=current.next;
			current.next=null;
			previous.next=nextNode;
			printLinkedList();
	}
	public boolean search(int key) {
		ListNode current=head;
		while(current!=null) {
			if(current.data==key) {
				return true;
			}
			current=current.next;
		}
		return false;
	}
	public void reverse() {
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		head = previous; // Update the head to the new front of the list
	    printLinkedList();
	}
	public void createALoopedLinkedList() {
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		ListNode fifth=new ListNode(5);
		ListNode sixth=new ListNode(6);
		head=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=third;
	}
	public boolean checkLoop() {
		ListNode fastPtr=head;
		ListNode slowPtr=head;
		while(fastPtr!=null & slowPtr!=null) {
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			if(fastPtr==slowPtr) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sll=new SinglyLinkedList();
		 sll.head=new ListNode(10); //10->
		 ListNode second=new ListNode(9); //10->9
		 ListNode third=new ListNode(8); //10->9->8
		 ListNode fourth=new ListNode(7); //10->9->8->7
		 ListNode fifth=new ListNode(6); //10->9->8->7->6		 
		 sll.head.next=second;
		 second.next=third;
		 third.next=fourth;
		 fourth.next=fifth;
		 sll.printLinkedList();
		 sll.findLength();
         sll.insertAtBegining(11);
         sll.insertAtEnd(5);
         sll.insertNodeAt(12,3);
         sll.deleteNodeAtFirst();
         sll.deleteNodeAtLast();
         sll.deleteNodeAt(2);
         sll.reverse();
         System.out.println(sll.search(134));
         sll.createALoopedLinkedList();
         System.out.println(sll.checkLoop());

	}
}
