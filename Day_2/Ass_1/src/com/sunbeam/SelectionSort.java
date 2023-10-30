package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {
	
	public static void sSort(int arr[])
	{
		int count=0;
		
		for(int i =0;i<arr.length-1;i++)
		{
			
			for(int j =i+1;j<arr.length;j++)
			{
				count++;
				if(arr[i] > arr[j])
				{
					
					int c;
					c = arr[i];
					arr[i]=arr[j];
					arr[j] = c;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Comparison \n"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100,200,232,5,98,87,67,90};
		sSort(arr);

	}

}
