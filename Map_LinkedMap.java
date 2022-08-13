package Collections;

import java.util.HashMap;
import java.util.Map;

public class Map_LinkedMap {
	
	static Map <String,Integer> M1 = new HashMap <String,Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		M1.put("Vikram", 62);
		M1.put("Sindhuja", 8);
		M1.put("Viha", 88);
		M1.put("vikram", null);
		M1.put("Vikram",8);
		M1.put(null, null);
		
		System.out.println(M1);
		
	}

}
