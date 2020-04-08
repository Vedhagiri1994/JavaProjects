package optimumInfo;

import java.util.Arrays;
import java.util.Comparator;

class SortArray implements Comparator<Integer> {
	public int compare(Integer number1, Integer number2) {
		return number2.compareTo(number1);
	}
}

public class Main2 {

	public static void main(String[] args) {

		Integer numbersArray[] = { 12, 13, 11 };
		Arrays.sort(numbersArray, new SortArray());
		for (int number : numbersArray) {
			System.out.println(number + " ");
		}

	}
}
