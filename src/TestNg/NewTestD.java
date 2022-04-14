package TestNg;

import org.testng.annotations.Test;

public class NewTestD {
	@Test
	  public void Page1() {
		  
		  System.out.println("Page1");
	  }
	  
	  
	  @Test(invocationCount=4)
	  public void Sidebar() {
		
		  System.out.println("Sidebar");
	  }
	 
}
