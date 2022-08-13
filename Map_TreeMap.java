package Collections;

import java.util.Map;
import java.util.TreeMap;

public class Map_TreeMap {

	static Map <Integer,Integer> M1 = new TreeMap <Integer,Integer>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		M1.put(10, 10000);
		M1.put(25, 1);
		M1.put(1, 3335);
		M1.put(13, 66);
		M1.put(7, 365);
		M1.put(55, 756);
		
		System.out.println(M1);
		System.out.println("-----------------------");
		
		Map <String,Integer> M2 = new TreeMap <String,Integer>();
		
		M2.put("viha", 1);
		M2.put("Vikram", 25);
		M2.put("Sindhuja" , 1);
		M2.put("Padma", 33);
		M2.put("viha", 1);
		M2.put("sindhuja", 25);
		M2.put("Sindhuja",8);
		
		System.out.println(M2);
		
	}

}
