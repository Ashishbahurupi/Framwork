package PracticePro;

public class Odd_Even_Count {

	public static void main(String[] args) {
		
		int num=645498489;
		
		int odd_count=0;
		
		int even_count=0;
		
		while(num>0) {
			
			int rem=num%10;
			
			if(num%2==0) {
				
				even_count++;
			}
			else {
				odd_count++;
				
			}
			
			num=num%10;
			
		}
			System.out.println("even no count is ="+even_count);
			
			System.out.println("odd no count is ="+odd_count);
		}

	}


