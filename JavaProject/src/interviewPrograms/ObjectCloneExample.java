package interviewPrograms;

public class ObjectCloneExample implements Cloneable {

	int rollNo;
	String name;

	ObjectCloneExample(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {

		try {
			ObjectCloneExample obj = new ObjectCloneExample(101, "Giri");
			ObjectCloneExample obj2 = (ObjectCloneExample) obj.clone();

			System.out.println(obj.rollNo + " " + obj.name);
			System.out.println(obj2.rollNo + " " + obj2.name);
		} catch (CloneNotSupportedException c) {

		}
	}

}
