package optimumInfo;

public class Main4 {

	public static class MusicFestival {
		public int price;
	}

	public static void changeString(String month) {
		month = "january";
	}

	public static void changeArray(String[] holidays) {
		holidays[1] = "5";
	}

	public static void changeObject(MusicFestival festival) {
		festival.price = 32;
	}

	public static void main(String[] args) {
		String month = "Febuary";
		changeString(month);
		System.out.println("The month is " + month);

		String[] holidays = new String[] { "1", "2" };
		changeArray(holidays);
		System.out.println("The holidays are on " + holidays[0] + " and " + holidays[1]);

		MusicFestival festival = new MusicFestival();
		festival.price = 40;
		changeObject(festival);
		System.out.println("The festival ticket price is" + festival.price + " $ ");
	}
}
