package interviewPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		
		String[] arr = {"Giri","Vithya","Giri","Deepa","Deepa","Santhi","Vinayagam"};
		Set s = new TreeSet();
		for(String a:arr){
			if(s.add(a)){
				System.out.println("Duplicate is " + a);
			}
		}
	}

}

/*int[] arr = {1,2,3,4,5,1,3,7};
Set dup = new TreeSet();

for(int a:arr){
	if(!dup.add(a)){
		System.out.println("Duplicate is :" +a);
	}
}*/