package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public void usingBuffer() {

		String given = "Vedhagiri";

		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());

	}

	public void usingOwnLogic() {

		String given = "Vedhagiri";

		char[] characterArray = given.toCharArray();

		String reversed = "";

		for (int i = characterArray.length - 1; i >= 0; i--) {

			reversed = reversed + characterArray[i];
		}

		System.out.println(reversed);

	}

	public void usingCollections() {

		String given = "Vedhagiri";
		char[] array = given.toCharArray();

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

	public static void main(String[] args) {

		ReverseString String = new ReverseString();
		String.usingCollections();
	}
}
