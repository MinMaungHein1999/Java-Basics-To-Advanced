package oop;

public class Employee {
	int id;
	String name;
	int age;
	String address;
	double salary;
	
	public Employee() {
		System.out.println("Employee Constructor");
	}
	
	public void displayInfo() {
		System.out.println("id : "+ this.id);
		System.out.println("Name : "+ this.name);
		System.out.println("Address : "+ this.address);
		System.out.println("Age : "+ this.age);
		System.out.println("Salary : "+ salary);
	}
}
