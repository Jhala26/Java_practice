package com.masai;

public class Stringee {
	
	 Stringee(String s) {
		
	}

	
	public static void main(String[] args) {
		Stringee st = new Stringee("Welcome");
		String st1 = "Welcome";
		String s = new String("Welcome");
		
		System.out.println(st);
		System.out.println(st1);
		System.out.println(s);
		System.out.println(s.equals(st1));
	}
	
}
