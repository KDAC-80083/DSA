package com.sunbeamq7;

import java.util.Stack;

public class List {

	class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			this.next = null;
		}

	}

	Node head;
	Node tail;

	public List() {
		head = null;
		tail = null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);

		if (head == null) {
			head = newnode;
			tail = newnode;
		}

		else {
			newnode.next = head;
			head = newnode;
			// tail = newnode;
		}
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List Is Empty");
		}

		else if (head.next == null) {
			head = null;
		}

		else {
			head = head.next;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		{
			if (head == null) {
				// System.out.println("List Is Empty!");
				head = newnode;
				tail = newnode;
			}

//			else if (head.next==null)
//			{
//				head = null;
//			}

			else {
				tail.next = newnode;
				tail = newnode;

			}
		}
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List Is Empty");
		}

		else if (head.next == null) {
			head = null;
		}

		else {
			Node trav = head;

			while (trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;

			tail = trav.next;
		}
	}

//	public void display()
//	{
//		Node trav = head;
//		if(head == null)
//		{
//			System.out.println("List is Empty!");
//		}
//		
//		else
//		{
//			while(trav!=null)
//			{
//				//System.out.println(trav.data);
//				//trav = trav.next;
//				trav = head;
//			}
//			
//			do
//			{
//				System.out.println(""+trav.data);
//				
//				
//			}while(trav!=head);
//			
//			System.out.println("");
//		}
//	}

	public void display() {
		Stack<Integer> st = new Stack<>();
		if (head == null) {
			System.out.println("List Is Empty!");
		}

		else {
			Node trav = head;
			while (trav != null)
			{
				st.push(trav.data);
				trav = trav.next;
			}

			while (!st.isEmpty()) {
				System.out.print(" " + st.pop());
			}
		}
	}

}
