package TestNg;

import org.testng.annotations.Test;

public class NewTestNG1 {
	@Test  (priority=1)
	  public void afterpage() {
		  
		  System.out.println("afterpage");
	  }
	  
	  @Test   (priority=2)
	  public void homepage() {
		  
		  System.out.println("homepage");
	  }
	  
	  @Test  (priority=3)
	  public void sidebar() {
		  
		  System.out.println("Side bar");
	  }
	  
}
