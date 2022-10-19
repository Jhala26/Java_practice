package com.masai5;

public class Employee {

	int employeeId;
	String employeeName;
	double salary;
	double netSalary;
	
	
	public void calculateNetSalary(int pfPercentage) {
		 this.netSalary=salary-(pfPercentage*salary)/100;
	}
}
