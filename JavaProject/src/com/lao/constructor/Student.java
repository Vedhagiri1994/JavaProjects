package com.lao.constructor;

public class Student {

	// Default Constructor
	
	String student_name;
	Integer roll_no;
	
	public static void main(String[] args) {
		
		Student student= new Student();
		System.out.println(student.student_name);
		System.out.println(student.roll_no);
		
	}
}
