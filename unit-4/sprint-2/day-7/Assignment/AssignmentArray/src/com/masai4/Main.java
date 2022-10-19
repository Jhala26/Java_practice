package com.masai4;

public class Main {

	public static void main(String[] value) {
		
		int n = value.length;
		int sum = 1;
		int s1 = Integer.parseInt(value[0]);
		
		
		if(n == 1) {
			for(int i=1;i<=s1;i++) {
				sum *= i;
			}
			System.out.println(sum);
		}
		else if(n == 2) {
			int s2 = Integer.parseInt(value[1]);
			int val = Math.abs(s1 - s2);
			for(int i=1;i<=val;i++) {
				sum *= i;
			}
			System.out.println(sum);
		}
		else {
			System.out.println("Error");
		}

	}

}
