package com.sunbeam;
import java.util.*;

public class TestStack {
	
	public static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0.EXIT");
		System.out.println("1.PUSH");
		System.out.println("2.POP");
		System.out.println("3.PEEK");
		System.out.println("Enter Choice :");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Size Of Stack:");
		int choice;
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Stack s = new Stack(size);
		
		while((choice = menu())!=0)
		{
			switch(choice)
			{
			case 1:
				if(s.isFull())
				{
					System.out.println("Enter Element");
					int ele = sc.nextInt();
					s.push(ele);		
				}
				break;
				
				
			case 2:
				
				if(s.isEmpty())
				{
					System.out.println("stack is empty!!");
				}
				
				else
				{
					s.pop();
				}
				break;
				
				
			case 3:
				if(!s.isEmpty())
				{
					s.peek();
				}
				else
					System.out.println("stack is empty");
				break;
				
			default:
				System.out.println("Wrong Input:!!!");
				break;
			}
		}

	}

}
