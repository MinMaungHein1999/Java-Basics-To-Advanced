package com.example.model;

public class PartTimeEmployee extends Employee {
	int hoursWorked;
	double hourlyRate;
	
	public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
		super(id, name, 0);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
		
}
