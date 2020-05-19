package com.lao.abstraction;

public class Bmw extends Car{

	@Override
	public void enginSecret(){
		System.out.println("BMW engine secret");
	}
	
	@Override
	public void companyValut(){
		System.out.println("BMW company valut");
	}
	
	public static void main(String[] args) {
	
		Car car = new Bmw();
		car.enginSecret();
		car.companyValut();
	}
}
