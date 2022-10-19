package com.masai3;

public class Ticket {

	int ticketID;
	int price;
	static int availableTickets;
	
	public int calculateTicketCost(int noOfTickets) {
		
		if(noOfTickets < availableTickets) {
			
			availableTickets = availableTickets - noOfTickets;
			
			int total = noOfTickets * price;
			
			return total;
			
		}
		else {
			return -1;
		}
		
	}
}
