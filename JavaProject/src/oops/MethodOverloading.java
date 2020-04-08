package oops;

public class MethodOverloading {
	
	static int add(int a, int b){
		return a+b;
	}
	
	static double add(double a, int b, int c){
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(11,12));
		System.out.println(add(10,11,12));
		
	}
}
