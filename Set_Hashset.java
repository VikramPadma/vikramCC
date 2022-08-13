package Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_Hashset {
	
	static Set <String> L1 = new HashSet <String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		L1.add("vikram");
		L1.add("Sindhu");
		L1.add("Viha");
		L1.add("Padma");
		L1.add("Viha");
		L1.add("Vikram");
	    L1.add("vikram");
	    L1.add("Sindhu");
	    
	    System.out.println(L1);
	    System.out.println("-------------------------");
	    
	    Set <Integer> L2 = new HashSet <Integer>();
	    
	    L2.add(null);
		L2.add(100);
		L2.add(10);
		L2.add(1);
		L2.add(20);
		L2.add(21);
		L2.add(1);
		L2.add(20);
		L2.add(21);
		
	    System.out.println(L2);
	    
	   
		
	}

}
