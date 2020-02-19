package interviewPrograms;

public class LengthofString {

	public static void main(String[] args) {
		
		String givenString = "Vedhagiri";
		
		System.out.println(givenString.length());

		char[] charArray = givenString.toCharArray();

		int length = 0;
		
		for (char c : charArray) {
		
			length++;

		}
		System.out.println(length);

	}

}
