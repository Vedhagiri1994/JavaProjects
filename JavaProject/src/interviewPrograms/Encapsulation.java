package interviewPrograms;

public class Encapsulation {
	
	private String name;
	private int rollno;
	private int age;
	
	public int getAge(){
		return age;
	}
	
	public int getrollno(){
		return rollno;
	}
	
	public String getname(){
		return name;
	}
	
	public void setAge(int newAge){
		age=newAge;
		
	}
	public void setName(String newName){
		name=newName;
	}
	public void setrollno(int newrollno){
		rollno=newrollno;
	}
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.getAge();
		
	}

}
