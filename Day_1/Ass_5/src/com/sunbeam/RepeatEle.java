package com.sunbeam;

public class RepeatEle {
	
	public static void repeatEle(int arr[])
	{
		int count=0;
		
		for(int i =0; i<arr.length;i++)
		{
			
			for(int j =0;j<arr.length;j++)
			{
				if(i!=j)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
			}
			if(count !=0)
			{
				count =0;
			}
	
			if(count ==0)
			{
				count = arr[i];
				
			}
			
		}
		System.out.println(count);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		repeatEle(arr);
		

	}

}
