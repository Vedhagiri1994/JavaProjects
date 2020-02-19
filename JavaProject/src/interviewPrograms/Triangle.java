package interviewPrograms;

import java.util.Scanner;

public class Triangle {

	public void starTriangale() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number of lines: ");

		int numberOfLines = scanner.nextInt();

		int row, column = 0;

		for (row = 0; row < numberOfLines; row++) {

			for (column = 0; column <= row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void numberTriangle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the rows :");
		int startingNumber = 1;
		int limit;
		limit = scanner.nextInt();
		int row, column;
		for (row = 0; row < limit; row++) {
			for (column = 0; column <= row; column++) {
				System.out.print(startingNumber + " ");
				startingNumber = startingNumber + 1;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Triangle t = new Triangle();
		t.numberTriangle();

	}

}
