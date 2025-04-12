package com.example.day3;

public class Array {
	
	private int[] arr;
	private int size;
	private int count;
	
	public Array(int size) {
		this.arr = new int[size];
	}
	
	public void add(int value) {
		this.arr[count] = value;
		count++;
	}
	
	public void remove(int index) {
		this.arr[index] = 0;
		count--;
	}
	
	public void remove() {
		this.arr[this.count] = 0;
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
	public int get(int index) {
		if(index>=size || index<0) {
			System.out.println("Invalid Array Index!!!!");
			return 0;
		}
		return this.arr[index];
	}
	

}
