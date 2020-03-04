package interviewPrograms;

public class LargestNumberInArray {

	static int givenArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static int largest() {

		int i;
		int max = givenArray[0];

		for (int i1 = 1; i1 < givenArray.length; i1++) {
			if (givenArray[i1] > max) {
				max = givenArray[i1];
				return max;
			}
		}
		return max;

	}

	public static void main(String[] args) {

		System.out.println("Largest Number is: " + largest());

	}

}
