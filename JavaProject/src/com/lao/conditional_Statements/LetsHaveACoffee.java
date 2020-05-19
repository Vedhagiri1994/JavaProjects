package com.lao.conditional_Statements;

public class LetsHaveACoffee {

	// If_and_ifElse

	boolean isCupEmpty = false;

	public static void main(String[] args) {

		LetsHaveACoffee coffee = new LetsHaveACoffee();

		if (coffee.isCupEmpty) {
			System.out.println("Fill the Cup");
		} else {
			System.out.println("Drink the coffee");
		}

	}

}
