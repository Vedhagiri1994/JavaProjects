package optimumInfo;

class Main6 {

	public static class P {
		{
			System.out.print("1");
		}
		static {
			System.out.print("2");
		}
	}

	public static class C extends P {
		{
			System.out.print("3");
		}
		static {
			System.out.print("4");
		}
	}

	public static void main(String[] args) {

		C c = new C();
	}

}
