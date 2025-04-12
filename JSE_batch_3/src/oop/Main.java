package oop;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.id = 1001;
		emp1.name = "U Mya Nyo";
		emp1.address ="Yangon";
		emp1.age = 20;
		emp1.salary = 3000;
		
		Employee emp2 = new Employee();
		
		emp2.id = 1002;
		emp2.name = "U Aung Kyaw";
		emp2.address = "Dawei";
		emp2.age = 40;
		emp2.salary = 2000;
		
		emp1.displayInfo();
		emp2.displayInfo();
	}

}
