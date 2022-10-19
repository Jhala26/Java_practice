package com.masai;
import java.util.Scanner;

public class Main {

	
	public static String reversString(String str) {
		int n = str.length();
		System.out.println(n);
		String rev = "";
		
		char[] arr = new char[n];
		char ch;
		
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			arr[i] = ch;
		}
		
		for(int i=n-1;i>=0;i--) {
			rev += arr[i];
		}
		
		
		
		return rev;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("\nOriginal String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
		
		
	}
	
}
