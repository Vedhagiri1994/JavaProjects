package exceptions;

public class MyClass {
	
	public static void main(String[] args) {
		
		try{
			String s=null;	
			s.length();
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		
		try{
			int a=50/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
		
		finally{
			System.out.println("The try catch is finished");
		}
		
	}

}
