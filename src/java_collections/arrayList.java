package java_collections;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Declare Array list
		
		//ArrayList al=new ArrayList();
		
		//ArrayList<integer>al=new ArrayList<integer>()
		
		//ArrayList<String>al=new ArrayLIst<String>();
		
		ArrayList al=new ArrayList();
		
		//Add new Elements to the ArrayList
		
		al.add(100);
        al.add("Welcome");	
        al.add(15.54);
        al.add('a');
        al.add(true);
        
        
        System.out.println(al);
        
        // size
        
              
        System.out.println(" number of Element in array list:" +al.size());
        
        //remove
        
       al.remove(1);
        
        System.out.println(al);//Welcome is Arrayelement
        
        // insert a new element
        //add(index,object)
        
        al.add(2,"python");
        
        System.out.println(al);
       
        // retrive specific elemnet
        
       // al.get(2);
        
        System.out.println(al.get(2));//python
        
        // set method(replace element)
        
        al.set(0,"Shisha");
        
        System.out.println("After replacing and element"+al);
        
        //serarch
        
        
        System.out.println(al.contains("shisha"));
        
        
        // is empty
        System.out.println(al.isEmpty());//
        
        //using for loop
        
        System.out.println("Reading element using for loop");
        
        
        
        
        
        
        
        
        	}
        

}
