package com.lao.conditional_Statements;

public class Who_is_the_Hero {
	
	String heroName= "ajith";
	
	public void superHeroGusser(){
		
		if(heroName.equalsIgnoreCase("Ajith")){
			System.out.println("Your thought about Ajith");
		}
		else if(heroName.equalsIgnoreCase("Rajini")){
			System.out.println("Your thought about Rajini");
		}
		else if(heroName.equalsIgnoreCase("Kamal")){
			System.out.println("Your thought about Kamal");
		}
		else{
			System.out.println("Sorry Icannot guess!!!");
		}
	}
	
	public static void main(String[] args) {
		
		Who_is_the_Hero hero= new Who_is_the_Hero();
		hero.superHeroGusser();
		
	}

}
