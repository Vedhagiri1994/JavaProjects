package interviewPrograms;

public class StringBasics {
	
	public static void main(String[] args) {
		
		String s = "hello Vedha";
		int m = s.indexOf("k");
		System.out.println(m);
		int m1 = s.indexOf("o");
		System.out.println(m1);
		int m2 = s.indexOf("h");
		System.out.println(m2);
		int m3 = s.lastIndexOf("h");
		System.out.println(m3);
		
		String m4 = s.replace("Vedha", "Giri");
		System.out.println(m4);
		
		String m5 = "";
		boolean k = m5.isEmpty();
		System.out.println(k);
		String m6 = " ";
		boolean k1 = m6.isEmpty();
		System.out.println(k1);
		
		boolean a1 = s.startsWith("hello");
		System.out.println(a1);
		boolean a2 = s.endsWith("Vedha");
		System.out.println(a2);
		
		int i = s.compareTo(m4);
		System.out.println(i);
		
	}

}
