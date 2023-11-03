package com.sunbeamq2;

public class List 
{
	
	class Node
	{
		private int data;
		private Node next;
		
		public Node(int value) {
			// TODO Auto-generated constructor stub
			this.data=value;
			this.next=null;
		}
		
		
	}
	
	private Node tail;
	
	public List() {
		// TODO Auto-generated constructor stub
		tail = null;
	}
	
	
	public void addFirst(int value)
	{
		Node newnode =  new Node(value);
		
		if(tail==null)
		{
			tail = newnode;
		}
		
		else
		{
//			Node trav = tail;
			
//			do
//			{
//				trav = trav.next;
//			}while(trav.next!=tail);
			newnode=tail.next;
			tail.next=newnode;
			
			//tail.next=newnode;
			
			
			
			
		}
	}
	
	
	public void display()
	{
		Node trav = tail;
		
		do
		{
			System.out.println(""+trav.data);
			trav=trav.next;
			
		}while(trav.next!=null);
	}
	
	

}
