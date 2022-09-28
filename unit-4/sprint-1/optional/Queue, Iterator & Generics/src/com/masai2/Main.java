package com.masai2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Queue<Product> p1 = new PriorityQueue<>();
		
		System.out.println("Enter no of Product detail you want to add");
		int x = sc.nextInt();
		
		for(int i=0;i<x;i++) {
			System.out.println("Enter Details of Product : "+ (i+1));
			
			System.out.println("\nEnter Product Id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("\nEnter Product Name");
			String name = sc.nextLine();
			System.out.println("\nEnter Product Price");
			int price = sc.nextInt();
			
			p1.add(new Product(id, name, price));
		}
		
		
		System.out.println("\n======================================================================================================\n");
		
		Iterator<Product> itr = p1.iterator();
		
		while(itr.hasNext() ) {
			
			Product p = itr.next();
			
			System.out.println(p);
		}

	}

}
