 package PracticePro;

public class CountDigitNo {

	public static void main(String[] args) {
		
		int num=564789954;
		
		int count=0;
		
		while(num>0) {
			
			num=num/10;
			
			count++;
		} 
		
		
       System.out.println("the no of count is "+ count);
	}

}
