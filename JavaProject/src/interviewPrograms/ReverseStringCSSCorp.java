package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseStringCSSCorp {

	public static void main(String[] args) {

		String given = "Welcome to CSS Corp";
		char array[] = given.toCharArray();

		List list = new ArrayList<Character>();

		for (Character character : array) {
			list.add(character);
		}
		Collections.reverse(list);

		ListIterator iterator = list.listIterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}

	}
}
