package interviewPrograms;

public class LargestNumberInArray {

	public static void main(String[] args) {

		int givenArray[] = { 1, 2, 3, 4, 13, 14, 15, 53 };
		int max = givenArray[0];

		for (int i = 0; i < givenArray.length; i++) {
			if (givenArray[i] > max) {
				max = givenArray[i];
			}
		}
		System.out.println(max);
	}

}

/*
 * int[] givenArray ={ 1, 2, 3, 4, 5, 6, 7, 8, 9 }; int max = givenArray[0];
 * 
 * for(int i=0; i<givenArray.length;i++){ if(givenArray[i]>max){ max =
 * givenArray[i]; } }
 * 
 * System.out.println(max);
 */