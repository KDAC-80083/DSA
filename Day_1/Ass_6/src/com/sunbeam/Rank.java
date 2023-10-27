package com.sunbeam;

import java.util.Scanner;

/*
 * 6. to find rank of an element in a stream of integers.
rank: rank of a given integer "x", in stream is "total no. of ele's less than or equal to x (including x).
	
	Input: { 10, 20, 15, 3, 4, 4, 1 }
	Ouput: Rank of 4 is: 4
 * 
 */
public class Rank {
	
	public static void integerFind(int arr[],int key)
	{
		int count=0;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<=key)
			{
				count++;
			}
		}
		System.out.println("Equal or Less than are"+count+"Numbers");
	}
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	public static void arrayInput(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values");
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		int arr[]= new int[size];
		arrayInput(arr);
		printArray(arr);
		System.out.println("Enter Key");
		int key = sc.nextInt();
		integerFind(arr,key);
		

	}

}
