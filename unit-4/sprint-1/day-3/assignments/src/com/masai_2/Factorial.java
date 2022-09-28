package com.masai_2;

public class Factorial {
	
	
	static void factor(int x) {
		
		if(x >= 2  && x <= 100) {
			
			System.out.println("The Factors of " + x + " are :");
			
			for(int i=1;i<=x;i++) {
				
				if(x % i == 0) {
					System.out.print(i+" ");
				}
			}
			
		}
		else {
			System.out.println("Invalid Number");
		}
		
	}

	
	public static void main(String[] args) {
		
		int value = 10;
		
		factor(value);
	}
}
