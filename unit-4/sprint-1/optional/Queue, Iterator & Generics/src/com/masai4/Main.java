package com.masai4;

public class Main {

	public static void main(String[] args) {
		
		// initialize generic class
	    // with Integer data
	    GenericsClass<Integer> intObj = new GenericsClass<>(5);
	    System.out.println("Generic Class returns: " + intObj.getData());

	    // initialize generic class
	    // with String data
	    GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
	    System.out.println("Generic Class returns: " + stringObj.getData());
	    
	    System.out.println("\n============================================================================================\n");
	    
	    System.out.println("\n =>  Generics in Java and Its Importance with example?\n");
	    System.out.println("Generics means parameterized types. The idea is to allow type (Integer, String, …\n etc., and user-defined types) to be a parameter to methods, classes, and interfaces.\n Using Generics, it is possible to create classes that work with different data types.\n An entity such as class, interface, or method that operates on a parameterized type\n is a generic entity.");

	}

}
