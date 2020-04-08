package oops;

public class MethodOverriding2 extends MethodOveriding1{
	
	void run(){
		System.out.println("Car is Running");
	}
	public static void main(String[] args) {
		
		MethodOverriding2 obj = new MethodOverriding2();
		obj.run();
	}

}
