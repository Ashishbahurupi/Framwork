package java_collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIstdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ArrayList al=new ArrayList();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("W");
		al.add("U");
		al.add("F");
		al.add("G");
		al.add("Q");
		al.add("I");
		
		ArrayList al_dup=new ArrayList();
		
		
		al_dup.addAll(al);
		
		System.out.println(al_dup);
		
		al_dup.removeAll(al);
		
		System.out.println("After removing "+al_dup);
		
		//Sorting ........Collections.sort();
		
		System.out.println(" Elements in the array list"+al);
        Collections.sort(al,Collections.reverseOrder());	
        
        System.out.println("Elements after sorting"+ al);
		
	}

}
