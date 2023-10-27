package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class DescBinarySearch {
	
	public static void DescBinarySearch(int arr[],int key)
	{
		int left =0;
		int right =arr.length-1;
		int mid;
		while(left<=right)
		{
			mid = (left+right)/2;
			
			if(key == arr[mid])
			{
				System.out.println("Key Found at  "+mid);
				return;
			}
			
			else if(key < arr[mid])
			{
				left = mid+1;
			}
			
			else 
			{
				right = mid -1;
			}
		}
		
		System.out.println("Key Not Found!!");
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
		System.out.println("Enter the Size of Array");
		int size =sc.nextInt();
		int arr[] = new int[size];
		arrayInput(arr);
		printArray(arr);
		System.out.println("Enter Key to Find");
		int key = sc.nextInt();
		DescBinarySearch(arr,key);
		
		

	}

}
