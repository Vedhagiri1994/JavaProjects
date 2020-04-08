package optimumInfo;

import java.util.HashMap;

public class Main5 {

	public static void main(String[] args) {

		HashMap<String, Integer> object1 = new HashMap<String, Integer>();
		object1.put("A", new Integer(30));
		object1.put("B", new Integer(20));
		object1.put("C", new Integer(80));
		object1.remove(new String("A"));
		System.out.println(object1);

	}

}
