package TestNg;

import org.testng.annotations.Test;

public class NewTestA {
	
	 
	 @Test(priority=2)
	  public void homepage() {
		  System.out.println("Homepage-testng");
	  }
	  @Test(priority=1)
	  public void generaltab() {
		  System.out.println("generaltab-testng");
	  }

	}

