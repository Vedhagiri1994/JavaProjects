package com.lao.constructor;

public class Draw {
	
	// String draw;
	
	// Constructor Overloading
	
	
	Draw(){
		
		System.out.println("Draw object created");
	}
	
	Draw(String toDraw){
		
		System.out.println("Drawing " + toDraw);
	}
	
	public static void main(String[] args) {
		
		Draw draw= new Draw();
		Draw draw2= new Draw("Circle");
		
	}

}
