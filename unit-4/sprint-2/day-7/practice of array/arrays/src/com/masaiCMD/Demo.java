package com.masaiCMD;

public class Demo {

	
	void fun1(int[] arr) {
		
		System.out.println("inside fun1 of Demo");
	}
	

	public static void main(String[] args) {
	
		Demo d1= new Demo();
		
		int[] mark = {10,20};
		
		//here we can pass 2 possible value
		//1. null default value for any ref variable
		//2. int array object, (loaded or without loaded)
		d1.fun1(mark);
		
		
	}
}
