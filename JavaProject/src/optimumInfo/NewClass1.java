package optimumInfo;

public class NewClass1 {
	
	public static class parent{
		  void print(){
			 System.out.println("Print in parent");
		 }
	}
	
	public static class child extends parent{
		@Override
		 void print(){
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
