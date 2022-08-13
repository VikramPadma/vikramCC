package Collections;

import java.util.Set;
import java.util.TreeSet;

public class List_TreeSet {
	
	static Set <String> L1 = new TreeSet <String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		L1.add("Padma");
		L1.add("Vikram");
		L1.add("Padma");
		L1.add("Sindhuja");
		L1.add("Aayansh");
		L1.add("Vikram");
		L1.add("sindhuja");
		
		System.out.println(L1);
		System.out.println("-------------------------");
		
		Set <Integer> L2 = new TreeSet <Integer>();
		
	    L2.add(22);
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
