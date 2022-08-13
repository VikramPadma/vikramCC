package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Combinations_2 {

	static Map <Integer,LinkedHashMap<String,String>> M1 = new LinkedHashMap <Integer,LinkedHashMap<String,String>>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap <String,String> H1 = new LinkedHashMap <String,String> ();
		
		H1.put("First Name", "Vikram");
		H1.put("Last Name", "Padma");
		H1.put("Job Title", "Automation Testing");
		H1.put("Employment Status", "Full time");
		H1.put("Sub Unit", "Testing");
		
		M1.put(245, H1);
		
		System.out.println(M1);
		
		

	}

}
