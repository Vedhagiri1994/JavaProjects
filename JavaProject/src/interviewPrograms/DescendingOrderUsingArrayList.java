package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DescendingOrderUsingArrayList {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("02");
		list.add("23");
		list.add("56");
		list.add("03");

		System.out.println("Print the given value: ");

		Iterator i = list.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		/*Comparator cmp = Collections.reverseOrder();
		Collections.sort(list, cmp);*/
		
		Collections.reverse(list);

		System.out.println("Print the decending Order: ");

		Iterator i2 = list.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}

/*
 * List list = new ArrayList(); list.add("Giri"); list.add("Vithya");
 * list.add("Deepa");
 * 
 * System.out.println("Print the given value");
 * 
 * Iterator i = list.iterator();
 * 
 * while(i.hasNext()){ System.out.println(i.next()); }
 * 
 * Comparator cmp = Collections.reverseOrder(); Collections.sort(list,cmp);
 * 
 * // Collections.reverse(list);
 * 
 * System.out.println("Print the desending order");
 * 
 * Iterator i2 = list.iterator();
 * 
 * while(i2.hasNext()){ System.out.println(i2.next()); }
 */
