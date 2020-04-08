package optimumInfo;

public class NewClass {
	
	public static class parent{
		 static void print(){
			 System.out.println("Print in parent");
		 }
	}
	
	public static class child extends parent
	{
		static void print(){
			System.out.println("print in child");
		}
	}
	
	public static void main (String args[]){
		parent A= new parent();
		parent B= new child();
		A.print();
		B.print();
	}
}
