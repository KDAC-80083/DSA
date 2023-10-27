package com.sunbeam;

public class Tester {
	
	public static void idComparison(Employee arr[],int key)
	{
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i].getId()==key)
			{
				System.out.println("Key Found At "+i+"Index");
				return;
			}
		}
		System.out.println("Key Not Found!");
		
	}
	
	public static void nameComparison(Employee arr[],String key)
	{
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i].getName().equals(key))
			{
				System.out.println("Key Found");
				return;
			}
		}
		System.out.println("Key Not Found!");
		
	}
	
	
	public static void salComparison(Employee arr[],double key)
	{
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i].getSal()==key)
			{
				System.out.println("Key Found At "+i+"Index");
				return;
			}
		}
		System.out.println("Key Not Found!");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee arr[] = new Employee[3];
		arr[0] = new Employee(101,"Rahul",1000);
		arr[1] = new Employee(102,"Adnan",2000);
		arr[2] = new Employee(103,"Raj",3000);
		//StringBuffer key = new StringBuffer("Rahul");
		//nameComparison(arr,"Singh");
		salComparison(arr,6000);
		
		
		

	}

}
