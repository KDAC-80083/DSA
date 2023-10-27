package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	public static void linearSearch(int arr[],int size,int key)
	{
		int count = 0;
		for(int i = 0;i<size;i++)
		{
			if (arr[i] == key) {
				System.out.println("Comparison Done To Search "+(++i));
				return;
				//return i;
				
			}
			count = i;
			
		}
		
		
		System.out.println("Key Not Found");
		System.out.println("Comparison Done To Search "+(++count));
		//return -1;
	
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
	
	public static void printArray(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array");
		int size = sc.nextInt();
		
		//int arr[] = {10,12,14,16,18,20};
		//int key =linearSearch(arr,6,14);
	
		int arr[] = new int[size];
		arrayInput(arr,size);
		printArray(arr,size);
		System.out.println("Enter The Key to Found");
		int key = sc.nextInt();
		linearSearch(arr,size,key);
		
//		if(key !=-1)
//		System.out.println("Key Found At"+ " "+key+" " +"Index");
//		else
//			System.out.println("Key Not Found");
		

	

}
}
