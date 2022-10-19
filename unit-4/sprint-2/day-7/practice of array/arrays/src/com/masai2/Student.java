package com.masai2;

public class Student {

	public int roll;
	public String name;
	
	Student(int roll, String name){
		this.name=name;
		this.roll = roll;
	}
	
	
	public void print() {
		System.out.println("My Roll is :"+roll+ "And my name is :"+name);
	}
}
