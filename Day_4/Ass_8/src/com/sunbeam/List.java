package com.sunbeam;

public class List {
	
	class Node
	{
		int data;
		Node next;
		
		Node(int value)
		{
			data = value;
			next = null;
		}
		
	}
	
	Node head;
	Node tail;
	
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		
		if(head == null)
		{
			head = newnode;
			tail = newnode;
		}
		
		else
		{
			Node trav = head;
			newnode.next= head;
			head = newnode;
			
			while(trav!=null)
			{
				
			}
		}
	}
	
	
	public void display()
	{
		Node trav = head;
		
		while(trav!=null)
		{
			System.out.println(""+trav.data);
			trav = trav.next;
		}
	}
	
	
	

}
