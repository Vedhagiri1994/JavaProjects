package interviewPrograms;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		String original, reverse="";
		
		System.out.println("Enter the palindrome number: ");
		
		Scanner sc = new Scanner(System.in);
		original= sc.nextLine();
		
		int length=original.length();
		
		for(int i=length-1;i>=0;i--){
			reverse=reverse+original.charAt(i);
			
		}
		if(original.equalsIgnoreCase(reverse)){
			System.out.println("This is palindrome");
			
		}
		else {
			System.out.println("This is not plaindrome");
		}
	}
}
