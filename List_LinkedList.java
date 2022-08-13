package Collections;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedList {
	
	static List<String> L1 = new LinkedList <String>();
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		L1.add("vikram");
		L1.add("Sindhu");
		L1.add("Viha");
		L1.add("Padma");
		L1.add("Viha");
		
		System.out.println(L1.get(3));
		System.out.println(L1.get(4));
		System.out.println("-----------------------------------");
		
		List<Integer> L2 = new LinkedList <Integer>();
		
		L2.add(null);
		L2.add(100);
		L2.add(10);
		L2.add(1);
		L2.add(20);
		L2.add(21);
		
		System.out.println(L2.get(0)); 
		
	}

}
