package interviewPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public void withThirdVariable() {
		int a = 10, b = 20, c;
		System.out.println("Before Swapping " + a + " " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping " + a + " " + b);
	}

	public void withOutThirdVariable() {

		int a = 10, b = 20;
		System.out.println("Before Swapping " + a + " " + b);
		a = a + b; // a=10+20=30
		b = a - b; // b=30-20=10
		a = a - b; // a=30-10=20

		System.out.println("After Swapping " + a + " " + b);

	}

	public void twovariableUsingScanner() {

		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swapping: " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping: " + a + " " + b);

	}

	public static void main(String[] args) {

		SwapTwoNumbers swapping = new SwapTwoNumbers();
		swapping.twovariableUsingScanner();

	}

}
