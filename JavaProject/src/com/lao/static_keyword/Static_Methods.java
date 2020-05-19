package com.lao.static_keyword;

public class Static_Methods {

	public static void method1() {
		System.out.println("Static method");
	}

	public void method2() {
		System.out.println("Non Static method");
	}

	public static void main(String[] args) {

		method1();
		/*
		 * Non static method can't access with out object
		 * 
		 * method2();
		 */
	}
}
