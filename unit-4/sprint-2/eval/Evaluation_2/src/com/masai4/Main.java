package com.masai4;
import java.util.Scanner;

public class Main {

	Laptop Laptop = new Laptop();
	
	public static Laptop getLaptop(String laptopPurpose){
		
		Main l1 = new Main();
		
		if(laptopPurpose.equals("gaming")){
			l1.Laptop.color = "Black";
			l1.Laptop.companyName = "Dell";
			l1.Laptop.purpose = "Gaming";
			l1.Laptop.name = "S1-Edition";
			l1.Laptop.cpu.manufacturer = " Radeon";
			l1.Laptop.cpu.processor = "Ryzen 9 5800H";
			l1.Laptop.cpu.clockSpeed = 3200.0;
			l1.Laptop.GraphicCard.manufacturer = "Radeon";
			l1.Laptop.GraphicCard.series = "RTX 3050 Ti";
			l1.Laptop.GraphicCard.capacity = "16GB";
			
			return l1.Laptop;
		}
		else if(laptopPurpose.equals("business")) {
			l1.Laptop.color = "Gray";
			l1.Laptop.companyName = "HP";
			l1.Laptop.name = "Notpad";
			l1.Laptop.purpose ="Business";
			l1.Laptop.cpu.manufacturer = "Intel";
			l1.Laptop.cpu.processor = "i5 10210U";
			l1.Laptop.cpu.clockSpeed = 1800.0;
			l1.Laptop.GraphicCard.manufacturer = "Intel";
			l1.Laptop.GraphicCard.series = "Iris Xe";
			l1.Laptop.GraphicCard.capacity = "Integrated";
		
			return l1.Laptop;
		}
		else if(laptopPurpose.equals("Entertainment")) {
	
			l1.Laptop.color = "White";
			l1.Laptop.companyName = "HP";
			l1.Laptop.name = "Notpad";
			l1.Laptop.purpose ="Entertainment";
			l1.Laptop.cpu.manufacturer = "Intel";
			l1.Laptop.cpu.processor = "i3 10210U";
			l1.Laptop.cpu.clockSpeed = 1800.0;
			l1.Laptop.GraphicCard.manufacturer = "Intel";
			l1.Laptop.GraphicCard.series = "Iris Xe";
			l1.Laptop.GraphicCard.capacity = "Integrated";
			
			return l1.Laptop;
		}
		return null;
	}	
	
	public static void main(String[] args) {
		
		Scanner lap = new Scanner(System.in); 
		
		System.out.println("Please Enter a valid purpose");
		String type = lap.next();
		
		Laptop gamingLaptop=getLaptop(type);
		gamingLaptop.displayDetails();
	}

}
