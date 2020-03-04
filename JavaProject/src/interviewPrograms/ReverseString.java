package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public void usingBuffer() {

		String given = "Welcome to CSS Corp";

		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());

	}

	public void usingOwnLogic() {

		String given = "Welcome to CSS Corp";

		char[] characterArray = given.toCharArray();

		String reversed = "";

		for (int i = characterArray.length - 1; i >= 0; i--) {

			reversed = reversed + characterArray[i];
		}

		System.out.println(reversed);

	}

	public void usingCollections() {

		String given= "Vedha";
		char[] array=given.toCharArray();
		List l=new ArrayList<Character>();
		for(Character c:array){
			l.add(c);
		}
		Collections.reverse(l);
		ListIterator iterator=l.listIterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next());
		}
		
	}

	public static void main(String[] args) {

		ReverseString String = new ReverseString();
		String.usingCollections();
	}
}
