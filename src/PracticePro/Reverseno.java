package PracticePro;

import java.util.Scanner;

public class Reverseno {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the no hear");
		int num=sc.nextInt();
		
		System.out.println(" Enter the no hear");
	
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
      System.out.println("Reverse no is "+rev);
	}

}
