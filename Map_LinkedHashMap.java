package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_LinkedHashMap {
 
	static Map <Integer,String> M1 = new LinkedHashMap <Integer,String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		M1.put(10, "Gaming");
		M1.put(1, "Cricket");
		M1.put(2,"Hockey");
		M1.put(null, null);
		M1.put(1, "cricket");
		M1.put(10,"FootBall");
		
		System.out.println(M1);
	}

}
