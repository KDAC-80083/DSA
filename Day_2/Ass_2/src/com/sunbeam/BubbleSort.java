package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bSort(int arr[])
	{
		int count =0;
		int flag = 0;
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				count++;
				if(arr[j]>arr[j+1])
				{
					int a =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
					flag=1;
				}
			}
			
			
			
			if(flag==0)
			break;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {10,89,76,56,43,23};
		int arr[]= {5,6,7,8,9};
		bSort(arr);

	}

}
