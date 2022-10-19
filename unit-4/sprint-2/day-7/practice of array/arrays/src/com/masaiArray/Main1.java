package com.masaiArray;

public class Main1 {
	
	
	public int grateElement(int[] arr) {
		
		int large = 0;
		
		for(int n:arr) {
			if(large < n) {
				large = n;
			}
		}
		return large;
	}

	public static void main(String[] args) {
		
		int[] marks = {100000,20,30,40,50,6000,70,80,90,100,150,300};
		
		Main1 a1 = new Main1();
	 	int elem = a1.grateElement(marks);
		
	 	System.out.println(elem);

	}

}
