package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[],int key)
	
	{
		int comp=0;
		int mid=(arr.length-1)/2;
		int left =0;
		int right =arr.length-1;
		while(left<=right)
		{
			++comp;
			mid =(left+right)/2;
			
			
			
			if(arr[mid] == key)
			{
				System.out.println("Element is "+arr[mid]+"Found at "+mid+"Index");
				System.out.println("Comparison ="+(++comp));
				//mid=(left+right)/2;
				//comp++;
				return -1;
				
				
			}
			else if(key<arr[mid])
			{
				right = mid-1;
				//mid = (left+right)/2;
				//comp++;
			}
			
			else
			{
				left = mid+1;
				//mid = (left+right)/2;
				//comp++;
			}
				
	}
		
		System.out.println("Comparison ="+(++comp));
		System.out.println("Element Not Found");
		return -1;
		
		
}
	
	
	public static void arrayInput(int arr[],int size)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values");
		for(int i =0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
	}
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		arrayInput(arr,size);
		printArray(arr);
		System.out.println("Enter Key");
		int key = sc.nextInt();
		binarySearch(arr,key);
	}

}
