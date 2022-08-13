package Collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Combination {
	
	static Map <Integer,ArrayList<String>> T1 = new LinkedHashMap<Integer,ArrayList<String>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> L1 = new ArrayList<String>();
		
		L1.add("Viha");
		L1.add("Attapur");
		L1.add("Rainbow");
		L1.add("July");
		
		T1.put(25, L1);
		
		System.out.println(T1);
		
		
		
		
		
	}

}
