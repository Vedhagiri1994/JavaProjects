package com.lao.constructor;

public class Employee {
	
	// No argument Constructor
	
	int employeeId;
	String employeeName;

	Employee(){
		
		employeeId=1;
		employeeName="Giri";
		
		System.out.println("Employee object is created");
	}
	
	public static void main(String[] args) {
		
		Employee employee= new Employee();
		
		
	}
}
