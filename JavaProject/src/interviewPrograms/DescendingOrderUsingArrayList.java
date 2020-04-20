package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DescendingOrderUsingArrayList {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("Giri");
		list.add("Vithya");
		list.add("Deepa");

		Iterator i = list.iterator();

		System.out.println("Print the list: ");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		Iterator i2 = list.iterator();

		Collections.reverse(list);
		System.out.println("Printing reverse order: ");
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}