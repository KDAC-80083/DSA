package com.sunbeam;

import java.util.Arrays;

public class Test {

	public static void insertionSort(Employee arr[], int n) {
		for (int i = 1; i < n; i++) {
			Employee temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j].getSal() > temp.getSal()) {
				arr[j + 1]=arr[j];
				j--;
			}

//			arr[j+1]=arr[j];
			arr[j + 1]=temp;
		}

//		for(int i =0;i<n;i++)
//		{
//			System.out.println(arr[i].getSal());
//		}
//		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(1000, "Raman");
		Employee e2 = new Employee(5000, "taman");
		Employee e3 = new Employee(3000, "yaman");
		Employee e4 = new Employee(5000, "iaman");
		Employee e5 = new Employee(2000, "oaman");
		Employee e6 = new Employee(9000, "paman");

		Employee[] arr1 = { e1, e2, e3, e4, e5, e6 };
		insertionSort(arr1, arr1.length);
//		System.out.println(Arrays.toString(arr));
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i].getSal());
//		}
		for (Employee employee : arr1) {
			System.out.println(employee);
		}
	}

}
