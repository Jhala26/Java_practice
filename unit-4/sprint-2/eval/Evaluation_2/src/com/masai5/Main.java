package com.masai5;
import java.util.Scanner;

public class Main {
	
	

	public static Employee getEmployeeDetails() {
		
		Employee e1 = new Employee();
		Scanner value = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = value.nextInt();
		e1.employeeId = id;
		
		value.nextLine();
		System.out.println("Enter Name : ");
		e1.employeeName = value.nextLine();
		System.out.println("Enter Salary : ");
		e1.salary = value.nextDouble();
		System.out.println("Enter PF : ");
		int per = value.nextInt();
		e1.calculateNetSalary(per);
		
		
		return e1;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = getEmployeeDetails();
		
		System.out.println("ID : "+ e1.employeeId );
		System.out.println("Name : "+ e1.employeeName );
		System.out.println("Salary : "+ e1.salary );
		System.out.println("Net Salary : "+ e1.netSalary);
	}

}
