package com.masai3;

public class Main {

	public int[] findAndReturnPrimeNumbers(int[] inputArray) {
		
		
		int[] prim;
		
		int size = 0;
		
		for(int i=0;i<inputArray.length;i++) {
			int fac = 0;
			for(int j=1;j<=inputArray[i];j++) {
				if(inputArray[i] % j == 0) {
					fac++;

				}
				
			}
			if(fac == 2) {
				size++;
			}
			
		}
		
		
			prim = new int[size];
		
	int sizee = 0;
		
		for(int i=0;i<inputArray.length;i++) {
			int fac = 0;
			for(int j=1;j<=inputArray[i];j++) {
				if(inputArray[i] % j == 0) {
					fac++;
//					System.out.println(1);
				}
				
			}
			if(fac == 2) {
				prim[sizee] = inputArray[i];
				sizee++;
			}
			
		}
		
		return prim;
		
		
	}
	
	public static void main(String[] args) {
		
		Main p1 = new Main();
		int[] arr = {10,12,5,50,11,14,15};
		
		int[] newarr =  p1.findAndReturnPrimeNumbers(arr);
		
		if(newarr.length > 0) {
			for(int i=0;i<newarr.length;i++) {
				if(newarr[i] != 0) {
					System.out.print(newarr[i]+ " ");
				}
			}
		}
		else {
			System.out.println("Prime number not found in the supplied Array");
		}
		
	}
	
}