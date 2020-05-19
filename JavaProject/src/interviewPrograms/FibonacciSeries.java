package interviewPrograms;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0, b = 1;
		for (int i = 1; i <= 10; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}

/*
 * int a = 0, b = 1, c = 0; for (int i = 1; i <= 10; i++) { c = a + b;
 * System.out.println(c); a = b; b = c; }
 */