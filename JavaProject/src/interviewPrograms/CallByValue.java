package interviewPrograms;

public class CallByValue {
	
	int data = 50;
	
	void change( int data){
		data= data+100;
	}
	public static void main(String[] args) {
		CallByValue obj = new CallByValue();
		
		System.out.println("Before Changing:" +obj.data);
		
		obj.change(500);
		
		System.out.println("After Change:" +obj.data);
		
	}

}
