package com.example.model;

public class FullTimeEmployee extends Employee {
	double allowance;
	double bonus;
	
	public FullTimeEmployee(int id, String name, double basicSalary, double allowance, double bonus) {
		super(id, name, basicSalary);
		this.allowance = allowance;
		this.bonus = bonus;
	}
	
}
