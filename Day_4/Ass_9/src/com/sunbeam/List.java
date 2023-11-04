package com.sunbeam;

import com.sunbeam.List.Node;

public class List 
{
	
	class Node
	{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			this.data = value;
			this.next=null;
		}
		
	}
	
	Node head;
	Node tail;
	
	public List()
	{
		head = null;
		tail = null;
	}
	
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		if(head == null)
		{
			head = newnode;
		}
		
		else
		{
			newnode.next = head;
			head = newnode;
		}
		
	}
	
	
	public void maxEle()
	{
		Node trav = head;
		//System.out.println("Head"+head.data);
		int max=trav.data;
		
		while(trav!=null)
		{
			//max = trav.data;
			//System.out.println("Trav"+trav.data);
			//System.out.println("In while"+max);
			
			if(trav.data > max)
			{
				//System.out.println("Inside If"+max);
				max = trav.data;
				
			}
			
			trav = trav.next;
		}
		
		System.out.println("Max Ele :"+max);
	}
	
	
	public void minEle()
	{
		Node trav = head;
		int min = trav.data;
		
		
		
		while(trav!=null)
		{
			if(trav.data<min)
			{
				min = trav.data;
			}
			
			trav = trav.next;
		}
		
		System.out.println("Min Ele :"+min);
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