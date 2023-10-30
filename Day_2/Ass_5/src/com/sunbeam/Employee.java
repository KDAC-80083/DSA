package com.sunbeam;

public class Employee {
	private double sal;
	private String name;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(double sal, String name) {
		this.sal = sal;
		this.name = name;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [sal=" + sal + ", name=" + name + "]";
	}
	
	
	
	

}
