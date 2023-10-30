package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			int j = i-1;
			
			count++;
			while(j>=0 && arr[j]>temp)
			{
				
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Comparison = "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {23,45,76,212,12,21,67,43,78};
		insertionSort(arr);

	}

}
