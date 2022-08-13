package Collections;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {

	static List <String> L1= new ArrayList <String>();
	
	public static void main(String[] args) {
		
		L1.add("vikram");
		L1.add("Sindhu");
		L1.add("Viha");
		L1.add("Padma");
		L1.add("Viha");
		
		
		System.out.println(L1);
		System.out.println("----------------------");
		
		List <Integer> L2 = new ArrayList <Integer>();
		
		L2.add(null);
		L2.add(100);
		L2.add(10);
		L2.add(1);
		L2.add(20);
		L2.add(21);
	    System.out.println(L2);
		

	} 

}
