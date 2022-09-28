package com.masai;

public class Main {
	
	static void printMonths(String month) {
		
		switch(month) {
		case "JAN":{
			System.out.println("This is the 1st Month of the Year January");
			break;
		}
		case "FEB":{
			System.out.println("This is the 2st Month of the Year February");
			break;
		}
		case "MAR":{
			System.out.println("This is the 3st Month of the Year March");
			break;
		}
		case "APR":{
			System.out.println("This is the 4st Month of the Year April");
			break;
		}
		case "MAY":{
			System.out.println("This is the 5st Month of the Year May");
			break;
		}
		case "JUN":{
			System.out.println("This is the 6st Month of the Year June");
			break;
		}
		case "JUL":{
			System.out.println("This is the 7st Month of the Year July");
			break;
		}
		case "AUG":{
			System.out.println("This is the 8st Month of the Year August");
			break;
		}
		case "SEP":{
			System.out.println("This is the 9st Month of the Year September");
			break;
		}
		case "OCT":{
			System.out.println("This is the 10st Month of the Year October");
			break;
		}
		case "NOV":{
			System.out.println("This is the 11st Month of the Year November");
			break;
		}
		case "DEC":{
			System.out.println("This is the 12st Month of the Year December");
			break;
		}
		default:{
			System.out.println("Invalid Input");
		}
		}
	}
	
		public static void runScored(int one, int two, int three, int four, int six) {
			
			int total = (one *1) + (two*2) + (three * 3)+ (four * 4) + (six * 6);
			
			System.out.println("Run scored by the batsman : " + total);
		}
	

	public static void main(String[] args) {
		
		
//		Question 1
		
		System.out.println("\n************************** Q = 1 *********************************\n");
		
		System.out.println(" Q1 : Explain why Java is platform independent ?\n");
		
		System.out.println("The Meaning of platform-independent is that the java compiled code(byte code) can run on all operating system. \n Whenever a program is written in JAVA, the javac compiles it.\n The result of the JAVA compilar is the (.class) file or the bytecode and not the machine native code \n The bytecode generated is a non-executable code and need an interpreter to execute on a machine. This interpreter is the JVM and thus the bytecode is executed by the JVM\n And finally this way we can run the javac bytecode file in any system if it is created in other system also. ");
		
		 
		
		
//		Question 2
		
		System.out.println("\n************************** Q = 2 *********************************\n");
		
		String month ="DEC";
		
		printMonths(month);
		
		
//		Question 3
		System.out.println("\n************************** Q = 3 *********************************\n");
		
		
			
			int a = 64;
			int b = 70;
			byte c = (byte)(a+b);        //typecast (a+b) to byte
			System.out.println("Result" + c);
			
			System.out.println("\n In this we have to Typecast the data type of a,b which is int according to c which is byte, \n SO for that we have to use (byte) befor Initialisation the c \n according to value of a, b it will give -122 because the range of byte is (-128 - 127)\n and the total of (a+b = 134) which is out of the range of byte data type \n So after 127 it starts from -128 and if we reduce -128 by extra value 17 then we will get -122");
			
			
//			Question 4
			System.out.println("\n************************** Q = 3 *********************************\n");
			
			int one = 1;
			int two = 1;
			int three = 1;
			int four = 1;
			int six = 1;
			
			
			runScored(one, two, three, four, six);
			
	}
}
	
