package com.lao.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Giri");
		list.add("Vedha");
		list.add("Vedha");
		list.add("Deepa");
		list.add("Vithya");
		list.add(null);
		list.add(null);

		System.out.println(list);

		// get index based
		System.out.println(list.get(3));

		// indexOf method based

		System.out.println(list.indexOf("Vedha"));

		// lastIndexOf method based

		System.out.println(list.lastIndexOf("Vedha"));

		// add the list to list1

		ArrayList<String> list1 = new ArrayList<String>();
		list1.addAll(list);
		list1.add("Sam");
		System.out.println(list1);

		// clear the list1

		list1.clear();
		System.out.println(list1);

		// remove the list of 1st index

		list.remove(1);
		System.out.println(list);

		// set

		list.set(5, "Sugu");
		System.out.println(list);

		// check the list1 is empty or not
		list1.add("Kamal");
		boolean al = list1.isEmpty();
		System.out.println(al);

		System.out.println("----------For each Iteration----------");

		for (String arraylist : list) {
			System.out.println(arraylist);
		}

		System.out.println("----------For loop Iteration----------");

		for (int a = 0; a <= list.size(); a++) {
			System.out.println(list.get(a));
		}
		
		System.out.println("----------Using ListIterator Iteration----------");

			ListIterator<String> list_itr = list.listIterator();

			while (list_itr.hasNext()) {
				System.out.println(list_itr.next());			
		}
			
			while(list_itr.hasPrevious()){
				System.out.println(list_itr.hasPrevious());
			}
			
		System.out.println("----------Using ListIterator Iteration----------");
		
		Iterator<String> itr= list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
