package com.lao.abstraction;

public class Benz extends Car{

	@Override
	public void enginSecret(){
		System.out.println("Benz engine secret");
	}
	
	@Override
	public void companyValut(){
		System.out.println("Benz company valut");
	}
	
	
	public static void main(String[] args) {
		
		Car car = new Benz();
		car.enginSecret();
		car.companyValut();
	}
}
