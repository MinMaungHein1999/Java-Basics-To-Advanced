package com.example;

public class Main {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 40;
		
		int total = add(num1, num2);
		
		total = add(total, num1);
		
		Math.sqrt(total);
		Math.pow(total, 2);
		

	}
	
	public static int add(int a, int b) {
		int total = a + b;
		return total;
	}

}
