package TestNg;

import org.testng.annotations.Test;

public class NewTestDE_ON {
  
	  @Test  
	  public void afterpage() {
		  
		  System.out.println("afterpage");
	  }
	  
	  @Test  
	  public void homepage() {
		  
		  System.out.println("homepage");
		  // Assert.assertTrue(false);
	  }
	  
	  @Test  (dependsOnMethods="homepage")
	  public void sidebar() {
		  
		  System.out.println("Side bar");
	  }
	  

	}


