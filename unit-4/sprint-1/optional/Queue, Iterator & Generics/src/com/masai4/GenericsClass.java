package com.masai4;

public class GenericsClass<T> {

	 // variable of T type
	  private T data;

	  public GenericsClass(T data) {
	    this.data = data;
	  }

	  // method that return T type variable
	  public T getData() {
	    return this.data;
	  }
	
}
