package com.masai3;

import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Library l1 = new Library();
		
		l1.lib.add(new Books(123, "Iron Man", "Shon Poll"));
		l1.lib.add(new Books(124, "Harry Porter", "John Hance"));
		l1.lib.add(new Books(125, "Magistic", "Jorge"));
		l1.lib.add(new Books(126, "Jurasic", "Peater"));
		l1.lib.add(new Books(124, "FastFurious", "Parker Jha"));

		for(Books b : l1.lib) {
			System.out.println(b);
		}
		
		System.out.println("\n===================================================================================\n");
		
		LinkedHashSet<Members> m1 = new LinkedHashSet<>();
		
		m1.add(new Members(123,"Anshul",111,"20/11/2022"));
		m1.add(new Members(124,"Ajay",112,"22/11/2022"));
		m1.add(new Members(125,"Rohit",113,"24/11/2022"));
		m1.add(new Members(126,"Vinay",114,"26/11/2022"));
		m1.add(new Members(127,"Ajay",115,"28/11/2022"));
		
		
		for(Members m : m1) {
			System.out.println(m);
		}
		
		
		
		

	}

}
