package com.example;

public class Looping {

	public static void main(String[] args) {
		
		for(int volume=3;!isFull(volume); addWater(volume) ) {
			
			System.out.println(volume);
			
		}

	}
	
	private static void addWater(int a) {
		a = a + 3;
	}

	private static boolean isFull(int volume) {
		boolean result = volume > 30;
		return result;
	}
}
