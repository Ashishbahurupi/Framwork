package TestNg;

import org.testng.annotations.Test;

public class NewTestB {
 
	 @Test
	  public void HomePage() {
		  
		  System.out.println("HomePage");
		  
	  }
	  @Test(dependsOnMethods="HomePage")
	  public void Sidebar() {
		
		  System.out.println("Sidebar");
		
	  }
	  }
