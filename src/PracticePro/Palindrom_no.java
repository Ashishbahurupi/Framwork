package PracticePro;

import java.util.Scanner;

public class Palindrom_no {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no here");
		int num=sc.nextInt();
		
		int org_no=num;
		 int rev=0;
		 
		 
		while(num!=0) {
			
			rev=rev*10+num%10;
			
			num=num%10;
		}
		System.out.println(rev);
	}

	}

