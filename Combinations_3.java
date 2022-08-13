package Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Combinations_3 {

	static Map <String,TreeMap<Integer,Integer>> M2 = new LinkedHashMap <String,TreeMap<Integer,Integer>>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap <Integer,Integer> T1 = new TreeMap <Integer,Integer>();
		
		T1.put(25, 5);
		T1.put(36, 6);
		T1.put(25, 4);
		T1.put(49, 7);
		T1.put(64, 8);
		T1.put(81, 9);
		T1.put(100, 10);
		
		M2.put("Sqaure Root", T1);
		
		System.out.println(M2);
		
	}

}
