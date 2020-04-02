package oops;

public class MethodOverloading {
	
	void operator (String str1, String str2){
		String s = str1+str2;
		System.out.println("Concatinated String: " +s);
	}
	
	void operator(int a, int b){
		int c=a+b;
		System.out.println("Sum= "+ c);
	}
	
	
	public static void main(String[] args) {
		MethodOverloading obj =  new MethodOverloading();
		obj.operator("Vedha","Giri");
		obj.operator(2, 3);
	}
}
