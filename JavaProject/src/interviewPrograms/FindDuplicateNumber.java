package interviewPrograms;

import java.util.Set;
import java.util.TreeSet;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,1,3,7};
		Set <Integer> dup = new TreeSet<Integer>();
		
		for(int a:arr){
			if(!dup.add(a)){
				System.out.println("Duplicate is :" +a);
			}
		}
	}

}
