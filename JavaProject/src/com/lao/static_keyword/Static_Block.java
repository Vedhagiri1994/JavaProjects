package com.lao.static_keyword;

public class Static_Block {
	
	static {
		System.out.println("Inside static block 1");
	}
	
	static {
		System.out.println("Inside static block 2");
	}
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
	}

}
