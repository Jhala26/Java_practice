package com.masai4;

public class Laptop {

	String color;
	String companyName;
	String name;
	String purpose;
	CPU cpu = new CPU();
	GraphicCard GraphicCard = new GraphicCard();
	
	public void displayDetails() {
		
		
		
		System.out.println("Laptop Details");
		System.out.println("\n=======================================================\n");
		
		System.out.println("Laptop Name =>"+ this.name);
		System.out.println("Company name =>"+ this.companyName);
		System.out.println("Laptop Color =>"+ this.color);
		System.out.println("Laptop Purpose =>"+ this.purpose);
		System.out.println("Cpu's Manufacturer =>"+ this.cpu.manufacturer);
		System.out.println("Cpu's Processor =>"+ this.cpu.processor);
		System.out.println("Cpu's ClockSpeed =>"+ this.cpu.clockSpeed);
		System.out.println("Graphic card's Manufacturer =>"+ this.GraphicCard.manufacturer);
		System.out.println("Graphic card's Series =>"+ this.GraphicCard.series);
		System.out.println("Graphic card's Capacity =>"+ this.GraphicCard.capacity);
		
	}
}
