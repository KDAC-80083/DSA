package com.sunbeam;

public class Stack {
	private int size;
	private int top=0;
	private int data;
	int arr[];
	
	public Stack() {
		// TODO Auto-generated constructor stub
	}

	public Stack(int size, int top) {
		//super();
		this.size = size;
		this.top = top;
	}
	
	public Stack(int size)
	{
		this.size=size;
		arr = new int[size];
	}
	
	public void push(int data)
	{
		
		arr[top] = data;
		top++;
		
		
	}
	
	public void pop()
	{
		top--;
	}
	
	public void peek()
	{
		System.out.println("Element is "+arr[top]);
	}
	
	public boolean isEmpty()
	{
			return top==0;
	}
	
	public boolean isFull()
	{
		if(top == size)
		{
			System.out.println("Stack is Full!");
			return false;
		}
		else
		{
			return true;
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	
	

	
	
}
