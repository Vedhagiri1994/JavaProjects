package com.lao.conditional_Statements;

public class Find_Super_Hero {

	String heroName= "rajini";
	
	public void heroOrNot(){
		switch (heroName) {
		case "ajith":
			System.out.println("Ajithi is a super hero");
			break;
		case "vijay":
			System.out.println("Vijay is a super hero");
			break;
		case "rajini":
			System.out.println("Rajini is a super hero");
			break;
		case "kamal":
			System.out.println("Kamal is a super hero");
			break;

		default:
			System.out.println(heroName +" sorry i dont know about super hero");
		}
	}
	public static void main(String[] args) {
		
		Find_Super_Hero super_Hero = new Find_Super_Hero();
		super_Hero.heroOrNot();
	}
}
