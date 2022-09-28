package com.masai;

public class Natural {
	
	
	static int natrualNumber(int x){
		
		int v = (x * (x+1)) / 2;
		
		return v;
	}

	public static void main(String[] args){
		
		int result =  natrualNumber(10);
		
		System.out.println(result);
	}
	
	
}
