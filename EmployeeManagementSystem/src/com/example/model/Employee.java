package com.example.model;

public class Employee {
	
	public static Employee[] employeeDB = new Employee[100];
	
	public int id;
	public String name;
	public double basicSalary;
	public static int count;
			
	public Employee(int id, String name, double basicSalary) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		count = count + 1;
	}
	
	public double calculateSalary() {
		return 0.0;
	}
}
