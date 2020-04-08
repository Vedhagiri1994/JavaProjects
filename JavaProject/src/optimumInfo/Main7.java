package optimumInfo;

import java.util.ArrayList;
import java.util.List;

public class Main7 {

	public static void main(String[] args) {

		List<String> listA = new ArrayList<String>();
		listA.add("A");

		List<String> listB = listA;

		List<String> listC = new ArrayList<>(listB);

		listA.clear();
		listB.add("B");
		listC.add("C");

		System.out.println(listA);
		System.out.println(listB);
		System.out.println(listC);

	}

}
