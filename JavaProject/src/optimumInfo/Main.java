package optimumInfo;

public class Main {
	
	public static void main(String args[]){
		try{
			throwerMethod();
			System.out.println("I");
		}catch(RuntimeException e){
			System.out.println("J");
		}catch(Exception e){
			System.out.println("K");
		}finally{
			System.out.println("L");
		}
		System.out.println("M");
	}
	public static void throwerMethod(){
		throw new RuntimeException();
	}

}
