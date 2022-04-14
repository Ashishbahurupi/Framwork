package PracticePro;

public class Swapping_no {
	
	public static void main(String args[]) {


	int a=10;
	int b=30;
	
	System.out.println(" Before swapping no "+a+" "+ b);
	
	// logic one 
	/*int t=a;
	
	a=b;
	
	b=t;*/
	
	//logic 2
	
	a=a+b;  // 10+30=40
	b=a-b;  //40-10=10
	a=a-b;
	
	System.out.println(" After swapping no "+a+" "+b);
	 
	
	
	
	
	}
}
