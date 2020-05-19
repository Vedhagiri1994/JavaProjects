package com.lao.static_keyword;

public class Static_Variables {
	
	static int accountBalance=0;
	String depositedBy;

	public static void main(String[] args) {
		
		Static_Variables object1 = new Static_Variables();
		object1.accountBalance=1000;
		object1.depositedBy="Giri";
		
		Static_Variables object2 = new Static_Variables();
		object2.accountBalance=2000;
		object2.depositedBy="Vedha";
		
		
		System.out.println("Object1 integer: "+object1.accountBalance);
		System.out.println("Object1 String: "+object1.depositedBy);
		System.out.println("Object2 integer: "+object2.accountBalance);
		System.out.println("Object2 String: "+object2.depositedBy);
	}

}
