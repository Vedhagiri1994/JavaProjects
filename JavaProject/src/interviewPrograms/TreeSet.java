package interviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TreeSet {
	public static void main(String[] args) {
		String s="TreeSet";
		String[] splitword=s.split("");
		Map<String,Integer>retrive=new HashMap<String,Integer>();
		for(String newword:splitword){
			retrive.put(newword,1);
		}
		Set<String>keyset=retrive.keySet();
		for(String string:keyset){
			if(string.equals("e")){
				System.out.println(string);
			}
		}
	}

}
