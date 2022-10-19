package com.masai3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		Ticket t1 = new Ticket();
		
		System.out.println("Enter no of bookings : ");
		int n = value.nextInt();
		
		System.out.println("Enter the available tickets : ");
		Ticket.availableTickets = value.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("\nEnter the ticketid : ");
			t1.ticketID = value.nextInt();
			
			System.out.println("Enter the Price : ");
			t1.price = value.nextInt();
			
			System.out.println("Enter the no of tickets: ");
			int qua = value.nextInt();
			
			System.out.println("\nAvailable tickets: " + t1.availableTickets);
			
			int total = t1.calculateTicketCost(qua);
			System.out.println("Total Amount : "+ total);
			
			System.out.println("Available ticket after booking : "+ t1.availableTickets);
			
		}
		

	}

}
