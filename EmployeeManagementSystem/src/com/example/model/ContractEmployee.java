package com.example.model;

public class ContractEmployee extends Employee{
	int contractDuration;
	double contractAmount;
	
	public ContractEmployee(int id, String name, int contractDuration, double contractAmount) {
		super(id, name, contractAmount);
		
		this.contractAmount = contractAmount;
		this.contractDuration = contractDuration;
	}

	@Override
	public double calculateSalary() {
		return this.contractAmount / this.contractDuration;
	}
}
