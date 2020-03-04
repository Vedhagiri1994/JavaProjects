package interviewPrograms;

import java.util.TreeSet;

public class FindDuplicateNumber {
	
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6,7,8,9,5,3};
		
		TreeSet<Integer> unique= new TreeSet<Integer>();
		
		for(int a: arr){
			if(!unique.add(a)){
				System.out.println("Duplicate entry is: "+a);
			}
		}
		
	}

}
